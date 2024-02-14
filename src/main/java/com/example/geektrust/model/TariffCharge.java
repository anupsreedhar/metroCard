package com.example.geektrust.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TariffCharge {

    public static final Map<String, Integer> tariff;
    static {
        Map<String, Integer> aMap = new HashMap<>();
        aMap.put("ADULT", 200);
        aMap.put("SENIOR_CITIZEN", 100);
        aMap.put("KID", 50);
        aMap.put("RETURN_PERCENTAGE", 50);
        aMap.put("AUTO_RECHARGE_PERCENTAGE",2);
        tariff = Collections.unmodifiableMap(aMap);
    }

}
