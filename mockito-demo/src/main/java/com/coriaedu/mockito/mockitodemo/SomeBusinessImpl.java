package com.coriaedu.mockito.mockitodemo;

import java.util.Arrays;
import java.util.OptionalInt;

public class SomeBusinessImpl {
    private DataService dataservice;

    int findTheGreatestFromAllData() {

        int[] data = dataservice.retrieveAllData();

        OptionalInt optMax = Arrays.stream(data).max();

        return optMax.orElse(Integer.MIN_VALUE);
    }
}

interface DataService {
    int[] retrieveAllData();
}
