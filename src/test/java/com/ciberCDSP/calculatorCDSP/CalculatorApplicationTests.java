package com.ciberCDSP.calculatorCDSP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorApplicationTests {

    @Test
    void testSumar() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sumar(2, 3));
    }
}


