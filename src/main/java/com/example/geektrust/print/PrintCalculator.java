package com.example.geektrust.print;

import com.example.geektrust.model.MetroSummary;
import com.example.geektrust.model.Response;

import java.util.*;

public class PrintCalculator {

     MetroSummary calculateTotal(List<Response> responseList){
        Map<String,Integer> passengerType = new HashMap<>();
        MetroSummary totalCharge = new MetroSummary();
        for(Response response:responseList) {
            totalCharge.setTotalCollection(totalCharge.getTotalCollection() + Optional.ofNullable(response.getCharge()).orElse(0));
            totalCharge.setTotalService(totalCharge.getTotalService() + Optional.ofNullable(response.getService()).orElse(0));
            passengerType.merge(response.getPassengerType(), 1, Integer::sum);
        }
        totalCharge.setPassengerType(passengerType);
        return totalCharge;
    }

    Map<String, Integer> sort(MetroSummary chargeCentral) {
        Map<String, Integer> sortedMapAsc = new TreeMap<>(chargeCentral.getPassengerType());
        return sortedMapAsc;
    }
}
