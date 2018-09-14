package com.zuhlke.ihub.mart.stores;

import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenStatus;
import org.springframework.stereotype.Component;

@Component
public class TokenStore {
    public Token add(Token token) {
        return token;
    }

    public TokenStatus updateTokenStatus(Token token, TokenStatus tokenStatus) {
        return tokenStatus;
    }

    public TokenStatus getTokenStatus(Token token) {
        return new TokenStatus("DONE");
    }
}
