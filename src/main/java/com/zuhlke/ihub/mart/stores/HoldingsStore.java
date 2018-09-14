package com.zuhlke.ihub.mart.stores;

import com.zuhlke.ihub.mart.models.Holdings;
import com.zuhlke.ihub.mart.models.Token;
import org.springframework.stereotype.Component;

@Component
public class HoldingsStore {

    public Holdings getHoldingsData(Token token) {
        return new Holdings("000000000410042", "22/05/2018", "485", "FOF Advisory Waiver", "ME", "163.19");
//        return new Holdings("000000000410042", "22/05/2018", null, "FOF Advisory Waiver", "ME", "163.19");
    }
}
