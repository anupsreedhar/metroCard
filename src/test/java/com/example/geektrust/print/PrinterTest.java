package com.example.geektrust.print;



import com.example.geektrust.model.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrinterTest {

    Printer printer;
    List<Response> responseList;
    @BeforeEach
    void setUp() {
        printer = new Printer();
        responseList = new ArrayList<>();
        Response response1 = new Response(100,null,"AIRPORT","SENIOR_CITIZEN");
        Response response2 = new Response(50,null,"AIRPORT","KID");
        Response response3 = new Response(203,3,"CENTRAL","ADULT");
        responseList.add(response1);
        responseList.add(response2);
        responseList.add(response3);
    }
    @Test
    public void print(){
        printer.print(responseList);
    }


}
