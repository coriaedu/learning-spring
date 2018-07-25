package com.coriaedu.junit;

import java.util.Arrays;

public class MyMath {

    int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
