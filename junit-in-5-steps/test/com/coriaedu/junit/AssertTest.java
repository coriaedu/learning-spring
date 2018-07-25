package com.coriaedu.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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
