package com.coriaedu.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
    MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("@Before");
    }

    @After
    public void after() {
        System.out.println("@After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass");
    }

    @Test
    public void sum_with3numbers() {
        System.out.println("Test1");
        // check that result == 6
        assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
    }

    @Test
    public void sum_with1number() {
        System.out.println("Test2");
        // check that result == 3
        assertEquals(3, myMath.sum(new int[] { 3 }));
    }

}
