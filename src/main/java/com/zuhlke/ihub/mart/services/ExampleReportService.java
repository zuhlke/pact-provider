package com.zuhlke.ihub.mart.services;

import com.zuhlke.ihub.mart.models.FOFReport;
import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenRequest;
import com.zuhlke.ihub.mart.models.TokenStatus;
import com.zuhlke.ihub.mart.repositories.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleReportService implements ReportService {
    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public FOFReport extractReportData(Token token) {
        return new FOFReport("000000000410042", "22/05/2018", "485", "FOF Advisory Waiver", "ME", "163.19");
//        return new FOFReport("000000000410042", "22/05/2018", null, "FOF Advisory Waiver", "ME", "163.19");
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
