package com.example.geektrust.engine;

import com.example.geektrust.account.Accountant;
import com.example.geektrust.booking.BookingCounter;
import com.example.geektrust.model.Request;
import com.example.geektrust.model.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculationEngineTest {

    Accountant accountant;
    BookingCounter bookingCounter;

    CalculationEngine calculationEngine;

    @BeforeEach
    void setUp() {
        calculationEngine = new CalculationEngine();
        accountant = new Accountant();
        bookingCounter = new BookingCounter();
    }
    @Test
    public void calculate() throws Exception {
        List<Request> requestList = bookingCounter.getRequest("./sample_input/input1.txt");
        Map<String, Integer> balanceList = new HashMap<>();
        balanceList.put("MC1",400);
        balanceList.put("MC2",50);
        balanceList.put("MC3",100);
        balanceList.put("MC4",50);
        balanceList.put("MC5",200);
        List<Response> responseList = calculationEngine.calculate(requestList,balanceList);
    }

    @Test
    public void calculate1() throws Exception {
        List<Request> requestList = bookingCounter.getRequest("./sample_input/input2.txt");
        Map<String, Integer> balanceList = new HashMap<>();
        balanceList.put("MC1",600);
        balanceList.put("MC2",500);
        balanceList.put("MC3",50);
        balanceList.put("MC4",50);
        balanceList.put("MC5",200);
        List<Response> responseList = calculationEngine.calculate(requestList,balanceList);
    }
}
