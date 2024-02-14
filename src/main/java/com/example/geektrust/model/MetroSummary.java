package com.example.geektrust.model;

import java.util.Map;

public class MetroSummary {


    int totalCollection;
    int totalService;
    Map<String,Integer> passengerType;

    public int getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(int totalCollection) {
        this.totalCollection = totalCollection;
    }

    public int getTotalService() {
        return totalService;
    }

    public void setTotalService(int totalService) {
        this.totalService = totalService;
    }
    public Map<String, Integer> getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(Map<String, Integer> passengerType) {
        this.passengerType = passengerType;
    }
}
