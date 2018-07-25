package com.coriaedu.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class AssertTest {

    @Test
    public void test() {
        assertEquals(2, 2);

        boolean cond = true;

        assertEquals(true, cond);
        assertTrue(cond);
        assertFalse(!cond);
    }

}
