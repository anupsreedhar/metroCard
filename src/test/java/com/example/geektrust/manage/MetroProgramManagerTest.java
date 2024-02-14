package com.example.geektrust.manage;

import com.example.geektrust.account.Accountant;
import com.example.geektrust.booking.BookingCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MetroProgramManagerTest {



  MetroProgramManager metroProgramManager;

    @BeforeEach
    void setUp() {
        metroProgramManager = new MetroProgramManager();
    }
    @Test
    public void manage(){
        metroProgramManager.manage("./sample_input/input1.txt");
    }
}
