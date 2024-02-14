package com.example.geektrust.booking;

import com.example.geektrust.model.Request;

import java.util.List;

public interface ICounter {
    public List<Request> getRequest(String fileName) throws Exception;
}
