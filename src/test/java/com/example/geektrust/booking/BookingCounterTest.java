package com.example.geektrust.booking;

import com.example.geektrust.model.Request;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BookingCounterTest {

    BookingCounter bookingCounter;

    @BeforeEach
    void setUp() {
       bookingCounter = new BookingCounter();
    }
    @Test
    public void getRequest() throws Exception {
        List<Request> requestList = bookingCounter.getRequest("./sample_input/input1.txt");
    }
}
