package com.example.geektrust.model;

public class Response {
    private Integer charge;
    private Integer service;
    private String fromStation;
    private String passengerType;


    public Response(Integer charge, Integer service, String fromStation,String passengerType) {
        this.charge = charge;
        this.service = service;
        this.fromStation = fromStation;
        this.passengerType = passengerType;
    }
    public Response(){

    }
    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

}
