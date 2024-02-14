package com.example.geektrust.print;


import com.example.geektrust.model.MetroSummary;
import com.example.geektrust.model.Response;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Printer extends PrintCalculator {

    public void print(List<Response> responseList){
        List<Response> responseCentral = responseList.stream().filter(response -> response.getFromStation().equals("CENTRAL"))
                .collect(Collectors.toList());
        List<Response> responseAirport = responseList.stream().filter(response -> response.getFromStation().equals("AIRPORT"))
                .collect(Collectors.toList());
      MetroSummary chargeCentral = calculateTotal(responseCentral);
      MetroSummary chargeAirport = calculateTotal(responseAirport);
        System.out.println("TOTAL_COLLECTION CENTRAL " +chargeCentral.getTotalCollection() +" "+chargeCentral.getTotalService());
        System.out.println("PASSENGER_TYPE_SUMMARY");

        Map<String, Integer> sorted  = sort(chargeCentral);
        for (Map.Entry<String, Integer> entry :sorted.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("TOTAL_COLLECTION AIRPORT " +chargeAirport.getTotalCollection() +" "+chargeAirport.getTotalService());
        System.out.println("PASSENGER_TYPE_SUMMARY");
        Map<String, Integer> sortedAirport  = sort(chargeAirport);
        for (Map.Entry<String, Integer> entry : sortedAirport.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }



}
