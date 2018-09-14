package com.zuhlke.ihub.mart.services;

import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenRequest;
import com.zuhlke.ihub.mart.models.TokenStatus;

public interface HoldingsService {
    Object extractReportData(Token token);
    Token getRequestToken(TokenRequest tokenRequest);
    TokenStatus getRequestTokenStatus(Token token);
}
