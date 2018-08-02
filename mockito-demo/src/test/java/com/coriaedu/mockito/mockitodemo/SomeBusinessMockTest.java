package com.coriaedu.mockito.mockitodemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestFromAllData() {

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 6 });

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

        int result = businessImpl.findTheGreatestFromAllData();

        assertThat(result).isEqualTo(24);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

        int result = businessImpl.findTheGreatestFromAllData();

        assertThat(result).isEqualTo(15);
    }
}
