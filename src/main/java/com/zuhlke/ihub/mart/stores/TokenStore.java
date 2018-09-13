package com.zuhlke.ihub.mart.stores;

import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.models.TokenStatus;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TokenStore {
    private final Map<String, String> tokenStatusMap = new HashMap<>();

    public Token add(Token token) {
        tokenStatusMap.put(token.getToken(), "In Progress");
        return token;
    }

    public TokenStatus updateTokenStatus(Token token, TokenStatus tokenStatus) {
        tokenStatusMap.replace(token.getToken(), tokenStatus.getStatus());

        return tokenStatus;
    }

    public void clear() {
        tokenStatusMap.clear();
    }

    public TokenStatus getTokenStatus(Token token) {
        return new TokenStatus(tokenStatusMap.get(token.getToken()));
    }
}
