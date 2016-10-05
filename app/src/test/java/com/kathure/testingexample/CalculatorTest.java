package com.kathure.testingexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kathure on 05/10/16.
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {

        mCalculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);

    }

    @Test
    public void subtract() throws Exception {

        assertEquals(1d, mCalculator.subtract(5d, 4d), 0);
    }

    @Test
    public void divide() throws Exception {

        assertEquals(4d, mCalculator.divide(20d, 5d),0 );
    }

    @Test
    public void multiply() throws Exception {

        assertEquals(20d, mCalculator.multiply(5d, 4d), 0);
    }

}