package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setUp() throws Exception {
        student=new Student();
    }

    @After
    public void tearDown() throws Exception {
        student=null;
    }

    @Test
    public void correctAnswer() {
        assertEquals("25.0 25 25",student.takeInput(4,new int[] {25,25,25,25}));
        assertNotEquals("100.00 25 24",student.takeInput(4,new int[] {25,25,25,25}));
        assertEquals("43.25 57 33",student.takeInput(4,new int[] {49,33,34,57}));
        assertNotEquals("43.25 25 20",student.takeInput(4,new int[] {49,33,34,57}));
        assertEquals("57.0 94 41",student.takeInput(4,new int[] {41,43,50,94}));
        assertNotEquals("820.50 25 294",student.takeInput(4,new int[] {41,43,50,94}));
    }
    @Test
    public void marksNotInRange() {
        assertNotNull("101 is not within the range 0-100",student.takeInput(4,new int[] {25,25,101,25}));
    }
    @Test
    public void arraySizeNotMatching(){
        assertNotNull("Array size is not matching with number of inputs",student.takeInput(3,new int[] {25,25,10,25}));
    }
}