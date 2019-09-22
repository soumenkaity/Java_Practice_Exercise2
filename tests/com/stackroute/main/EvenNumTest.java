package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum evenNum;

    @Before
    public void setUp() throws Exception {
        evenNum=new EvenNum();
    }

    @After
    public void tearDown() throws Exception {
        evenNum=null;
    }

    @Test
    public void isEven() {
        assertTrue(evenNum.isEven(312));
    }
    @Test
    public void isOdd() {
        boolean expectedValue=false;
        boolean actualValue=evenNum.isEven(313);
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void isNotOdd() {
        boolean expectedValue=false;
        boolean actualValue=evenNum.isEven(312);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void isNotEven() {
        boolean expectedValue=true;
        boolean actualValue=evenNum.isEven(313);
        assertNotEquals(expectedValue,actualValue);
    }
}