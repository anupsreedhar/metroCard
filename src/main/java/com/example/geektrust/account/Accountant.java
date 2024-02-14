package com.example.geektrust.account;

import com.example.geektrust.engine.CalculationEngine;
import com.example.geektrust.model.Request;
import com.example.geektrust.model.Response;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Accountant {
    public List<Response> getBalanceSheet(List<Request> requestList){
        List<Request> req = requestList.stream().filter(request -> request.getCommand().equals("BALANCE"))
                .collect(Collectors.toList());
        CalculationEngine calculationEngine = new CalculationEngine();
        return calculationEngine.calculate(requestList,  req.stream().collect(
                Collectors.toMap(Request::getMetroCardNumber, Request::getBalanceInMetroCard)));
    }
}
