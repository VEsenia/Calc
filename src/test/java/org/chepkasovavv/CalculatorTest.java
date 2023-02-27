package org.chepkasovavv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testMakeCalc() {
        assertEquals("5", Calculator.makeCalc("2+3"));
        assertEquals("7", Calculator.makeCalc("7"));
        assertEquals("7", Calculator.makeCalc("17-2*(2+3)"));
        assertEquals("0", Calculator.makeCalc("36-2*(3+5*(2+1))"));
        assertEquals("87", Calculator.makeCalc("40+7*8-9"));
    }
}