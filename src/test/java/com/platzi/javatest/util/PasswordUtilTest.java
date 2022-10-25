package com.platzi.javatest.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    private PasswordUtil pass;
    @Before
    public void init(){
        pass = new PasswordUtil();
    }

    @Test
    public void testWeakPassWhenLessThan8Letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, pass.assessPassword("1234567"));
    }

    @Test
    public void testWeakPassWhenOnlyLetters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, pass.assessPassword("abcdefg"));
    }

    @Test
    public void testMediumWhenHasLettersAndNumbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, pass.assessPassword("1234abcd"));
    }

    @Test
    public void testStrongWhenHasLettersNumbersAndSymbols() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG, pass.assessPassword("1234abcd.*!"));
    }

}