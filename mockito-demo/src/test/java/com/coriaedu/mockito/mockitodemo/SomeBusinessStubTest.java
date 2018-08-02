package com.coriaedu.mockito.mockitodemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SomeBusinessStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());

        int result = businessImpl.findTheGreatestFromAllData();

        assertThat(result).isEqualTo(24);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] { 24, 6, 15 };
    }
}