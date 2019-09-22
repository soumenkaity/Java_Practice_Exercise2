package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {
    Problem1 problem1;
    @Before
    public void setUp() throws Exception {
        problem1=new Problem1();
    }

    @After
    public void tearDown() throws Exception {
        problem1=null;
    }
    @Test
    public void givenInputShouldPrintMessage(){
        assertEquals("Input is not palindrome", problem1.checkPalindrome("sdfgh9834@#$jah"));
        assertEquals("Input is palindrome", problem1.checkPalindrome("sdfgh9889hgfds"));
        assertEquals("Input is not palindrome", problem1.checkPalindrome("12345321"));
    }
    @Test
    public void givenNullShouldPrintError(){
        assertEquals("No input is given",problem1.checkPalindrome(null));
    }
}