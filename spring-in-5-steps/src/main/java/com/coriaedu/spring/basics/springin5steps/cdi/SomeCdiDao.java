package com.coriaedu.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public int[] getData() {
        return new int[] { 15, 89, 100 };
    }

}
