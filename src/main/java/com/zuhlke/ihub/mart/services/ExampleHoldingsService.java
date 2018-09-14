package com.zuhlke.ihub.mart.services;

import com.zuhlke.ihub.mart.models.Holdings;
import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenRequest;
import com.zuhlke.ihub.mart.models.TokenStatus;
import com.zuhlke.ihub.mart.repositories.HoldingsRepository;
import com.zuhlke.ihub.mart.repositories.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleHoldingsService implements HoldingsService {
    @Autowired
    private TokenRepository tokenRepository;
    @Autowired
    private HoldingsRepository holdingsRepository;

    @Override
    public Holdings extractReportData(Token token) {
        return holdingsRepository.getHoldingsData(token);
    }

    @Override
    public Token getRequestToken(TokenRequest tokenRequest) {
        return tokenRepository.save(new Token("unique_token"));
    }

    @Override
    public TokenStatus getRequestTokenStatus(Token token) {
        return new TokenStatus("DONE");
    }
}
