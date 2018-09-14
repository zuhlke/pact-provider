package com.zuhlke.ihub.mart.repositories;

import com.zuhlke.ihub.mart.models.Holdings;
import com.zuhlke.ihub.mart.models.Token;
import com.zuhlke.ihub.mart.stores.HoldingsStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HoldingsRepository {
    @Autowired
    private HoldingsStore holdingsStore;

    public Holdings getHoldingsData(Token token) {
        return holdingsStore.getHoldingsData(token);
    }
}
