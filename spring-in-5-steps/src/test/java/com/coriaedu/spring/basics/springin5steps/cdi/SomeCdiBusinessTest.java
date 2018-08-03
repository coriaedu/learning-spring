package com.coriaedu.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

// Load the Spring Context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    // Inject Mock here:
    @InjectMocks
    SomeCdiBusiness business;

    // Create Mock
    @Mock
    SomeCdiDao mockCdiDao;


    @Test
    public void testBasicScenario() {
        when(mockCdiDao.getData()).thenReturn(new int[] { 2, 4 });
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void testBasicScenario_noValues() {
        when(mockCdiDao.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    public void testBasicScenario_equalValues() {
        when(mockCdiDao.getData()).thenReturn(new int[] { 2, 2 });
        assertEquals(2, business.findGreatest());
    }

}
