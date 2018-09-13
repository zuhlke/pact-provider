package com.zuhlke.ihub.mart.services;

import com.zuhlke.ihub.mart.models.FOFReport;
import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenRequest;
import com.zuhlke.ihub.mart.models.TokenStatus;
import org.springframework.stereotype.Service;

@Service
public class ExampleReportService implements ReportService {
    @Override
    public FOFReport extractReportData(Token token) {
        return new FOFReport("000000000410042", "22/05/2018", "485", "FOF Advisory Waiver", "ME", "163.19");
    }

    @Override
    public Token getRequestToken(TokenRequest tokenRequest) {
        return new Token("unique_token");
    }

    @Override
    public TokenStatus getRequestTokenStatus(Token unique_token) {
        return new TokenStatus("DONE");
    }
}
