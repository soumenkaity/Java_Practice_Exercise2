package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {
    Problem2 problem2;
    @Before
    public void setUp() throws Exception {
        problem2=new Problem2();
    }

    @After
    public void tearDown() throws Exception {
        problem2=null;
    }

    @Test
    public void givenInputShouldPrintMessage(){
        assertEquals("Power of 4", problem2.checkPowerOfFour("16.00"));
        assertEquals("Not power of 4", problem2.checkPowerOfFour("12"));
    }

    @Test
    public void givenNullShouldPrintErrorMessage(){
        assertEquals("No input is given", problem2.checkPowerOfFour(null));
    }

    @Test
    public void givenNegativeShouldPrintErrorMessage(){
        assertEquals("Number should be greater than 0", problem2.checkPowerOfFour("-34"));
    }

    @Test
    public void givenWrongInputShouldPrintErrorMessage(){
        assertEquals("Wrong input", problem2.checkPowerOfFour("fg76"));
    }
}