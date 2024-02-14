package com.example.geektrust.manage;

import com.example.geektrust.account.Accountant;
import com.example.geektrust.booking.ICounter;
import com.example.geektrust.engine.CalculationEngine;
import com.example.geektrust.booking.BookingCounter;
import com.example.geektrust.model.Request;
import com.example.geektrust.model.Response;
import com.example.geektrust.print.Printer;

import java.util.List;
import java.util.Map;

public class MetroProgramManager implements IProgramManager {
    public void manage(String fileName){
        try {
            ICounter bookingCounter = new BookingCounter();
            List<Request> requestList = bookingCounter.getRequest(fileName);
            Accountant accountant = new Accountant();
            List<Response> responseList  = accountant.getBalanceSheet(requestList);
            Printer print = new Printer();
            print.print(responseList);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
