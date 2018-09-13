package com.zuhlke.ihub.mart.controllers;

import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenStatus;
import com.zuhlke.ihub.mart.repositories.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("pact")
public class PactSetupController {
    @Autowired
    private TokenRepository tokenRepository;

    @PostMapping("/setup")
    public void setup(@RequestParam("state") String state) {
        switch(state) {
            case "No token":
                tokenRepository.deleteAll();
                break;
            case "Status of token has become DONE":
            case "Token status is DONE":
                tokenRepository.updateStatus(new Token("unique_token"), new TokenStatus("DONE"));
                break;
            default:
                throw new UnsupportedOperationException("Unknown state requested: " + state);
        }
    }
}
