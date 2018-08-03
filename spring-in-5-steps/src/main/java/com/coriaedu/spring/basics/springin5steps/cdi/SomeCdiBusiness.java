package com.coriaedu.spring.basics.springin5steps.cdi;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest() {
        int[] data = someCdiDao.getData();

        return Arrays.stream(data).max().orElse(Integer.MIN_VALUE);
    }

}
