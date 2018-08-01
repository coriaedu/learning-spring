package com.coriaedu.mockito.mockitodemo;

import java.util.Arrays;
import java.util.OptionalInt;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData() {

        int[] data = dataService.retrieveAllData();

        OptionalInt optMax = Arrays.stream(data).max();

        return optMax.orElse(Integer.MIN_VALUE);
    }
}