package com.stackroute.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable memberVariable;
    @Before
    public void setUp() throws Exception {
        memberVariable = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        memberVariable = null;
    }
    @Test
    public void givenInputShouldPrintMessage(){
        memberVariable.initialiseVariables("khgytfy jhxhs",56,67822.42);
        assertEquals("Members Name: khgytfy jhxhs Members Age: 56 Members Salary: 67822.42",memberVariable.showVariables());
    }
    @Test
    public void givenNoInputShouldNotGiveNull(){
        assertNotNull(memberVariable.showVariables());
    }

}