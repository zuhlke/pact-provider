package com.zuhlke.ihub.mart.repositories;

import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenStatus;
import com.zuhlke.ihub.mart.stores.TokenStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenRepository {
    @Autowired
    private TokenStore tokenStore;

    public Token save(Token token) {
        return tokenStore.add(token);
    }

    public TokenStatus updateStatus(Token token, TokenStatus tokenStatus) {
        return tokenStore.updateTokenStatus(token, tokenStatus);
    }

    public void deleteAll() {
        //Delete all tokens
    }

    public TokenStatus getStatusByToken(Token token) {
        return tokenStore.getTokenStatus(token);
    }
}
