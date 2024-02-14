package com.example.geektrust.booking;

import com.example.geektrust.model.Request;
import com.example.geektrust.model.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookingCounter implements ICounter {

    public List<Request> getRequest(String fileName) throws Exception{
        List<Request> requestList = new ArrayList<>();
        Pattern pattern = Pattern.compile(" ");
        try (
            Stream<String> stream = Files.lines(Paths.get(fileName))) {
            requestList = stream.map(line -> {
                String[] arr = pattern.split(line);
                if (arr.length == Constants.THREE)
                    return new Request(arr[0], arr[Constants.ONE], Integer.parseInt(arr[Constants.TWO]));
                else if (arr.length == Constants.FOUR)
                    return new Request(arr[0], arr[Constants.ONE], arr[Constants.TWO], arr[Constants.THREE]);
                return new Request(arr[0], null, null, null);
            }).collect(Collectors.toList());

        } catch (IOException e) {
              throw e;
        }
        return requestList;
    }
}
