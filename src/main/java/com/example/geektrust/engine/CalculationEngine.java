package com.example.geektrust.engine;

import com.example.geektrust.model.*;

import java.util.*;
import java.util.stream.Collectors;

public class CalculationEngine {

    public List<Response> calculate(List<Request> requestList, Map<String, Integer> balanceMap){

        List<Request> checkInList = requestList.stream().filter(request -> request.getCommand().equals("CHECK_IN"))
                .collect(Collectors.toList());

        List<String> cardList = new ArrayList<>();
        List<Response> responseList = new ArrayList<>();

        for (Request request:checkInList){
            int balance = balanceMap.get(request.getMetroCardNumber());
            cardList.add(request.getMetroCardNumber());
            Pair<Integer,Integer> pair = getCharge(request,cardList,balance);
            balanceMap.put(request.getMetroCardNumber(), Math.max(balance - Optional.ofNullable(pair.retrieveKey()).orElse(0), 0));
            responseList.add(createResponse(pair,request));
        }
    return responseList;
    }

   private Pair<Integer,Integer> getCharge(Request request, List<String> cardList,int balance) {
       int charge = TariffCharge.tariff.get(request.getPassengerType());
       int frequencyOfCardNumber = Collections.frequency(cardList, request.getMetroCardNumber());
       int discount = 0;
       if (frequencyOfCardNumber % Constants.TWO == 0) {
           charge = TariffCharge.tariff.get(request.getPassengerType()) * TariffCharge.tariff.get("RETURN_PERCENTAGE") / Constants.PERCENTAGE;
           discount = TariffCharge.tariff.get(request.getPassengerType()) - charge;
       }
       int service = 0;
       if (balance < charge) {
           service = getReloadCardServiceCharge(charge - balance);
           charge = charge + service;
       }
       return new Pair(charge, discount);
   }

   private int getReloadCardServiceCharge(int reload){
       int service = reload * Constants.SERVICE_FEE / Constants.PERCENTAGE;
       return service;
   }

   private Response createResponse(Pair<Integer,Integer> pair,Request request){
       return new Response(pair.retrieveKey(), pair.retrieveVal(),request.getFromStation(), request.getPassengerType());
   }

}
