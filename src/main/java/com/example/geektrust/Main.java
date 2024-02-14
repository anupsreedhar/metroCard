package com.example.geektrust;

import com.example.geektrust.manage.IProgramManager;
import com.example.geektrust.manage.MetroProgramManager;

public class Main {

    public static void main(String[] args) {
        String fileName = args[0];
        IProgramManager metroProgramManager = new MetroProgramManager();
        metroProgramManager.manage(fileName);

    }
}
