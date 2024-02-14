package com.example.geektrust.account;

import com.example.geektrust.booking.BookingCounter;
import com.example.geektrust.model.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class AccountantTest {

    Accountant accountant;
    BookingCounter bookingCounter;

    @BeforeEach
    void setUp() {
        accountant = new Accountant();
        bookingCounter = new BookingCounter();
    }
    @Test
    public void getBalanceSheet() throws Exception {
        List<Response> balanceList = accountant.getBalanceSheet(bookingCounter.getRequest("./sample_input/input1.txt"));
    }
}
