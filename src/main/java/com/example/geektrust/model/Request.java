package com.example.geektrust.model;

public class Request {

    String command;
    String metroCardNumber;
    Integer balanceInMetroCard;
    String passengerType;
    String fromStation;

    public Request(String command, String metroCardNumber, Integer balanceInMetroCard) {
        this.command = command;
        this.metroCardNumber = metroCardNumber;
        this.balanceInMetroCard = balanceInMetroCard;
    }
    public Request(String command, String metroCardNumber, String passengerType, String fromStation) {
        this.command = command;
        this.metroCardNumber = metroCardNumber;
        this.passengerType = passengerType;
        this.fromStation = fromStation;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getMetroCardNumber() {
        return metroCardNumber;
    }

    public void setMetroCardNumber(String metroCardNumber) {
        this.metroCardNumber = metroCardNumber;
    }

    public Integer getBalanceInMetroCard() {
        return balanceInMetroCard;
    }

    public void setBalanceInMetroCard(Integer balanceInMetroCard) {
        this.balanceInMetroCard = balanceInMetroCard;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

}
