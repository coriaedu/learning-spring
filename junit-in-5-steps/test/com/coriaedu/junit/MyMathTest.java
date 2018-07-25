package com.coriaedu.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
    MyMath myMath = new MyMath();

    @Test
    public void sum_with3numbers() {
        // check that result == 6
        assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
    }

    @Test
    public void sum_with1number() {
        // check that result == 3
        assertEquals(3, myMath.sum(new int[] { 3 }));
    }

}
