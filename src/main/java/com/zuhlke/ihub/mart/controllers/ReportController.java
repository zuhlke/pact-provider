package com.zuhlke.ihub.mart.controllers;

import com.zuhlke.ihub.mart.models.Holdings;
import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenRequest;
import com.zuhlke.ihub.mart.models.TokenStatus;
import com.zuhlke.ihub.mart.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;

    @PostMapping("/fnv-api/V1/holdings")
    public Token getRequestToken(TokenRequest tokenRequest) {
        return reportService.getRequestToken(tokenRequest);
    }

    @PostMapping("/fnv-api/V1/status")
    public TokenStatus getTokenStatus(Token token) {
        return reportService.getRequestTokenStatus(token);
    }

    @PostMapping("/fnv-api/V1/holdings-data")
    public Holdings getHoldingsData(Token token) {
        return (Holdings) reportService.extractReportData(token);
    }
}
