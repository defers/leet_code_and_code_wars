package com.defers.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

public class CenturyFromYearTest {

    @Test
    public void FixedTests() {
        assertEquals(1, CenturyFromYear.century(89));
        assertEquals(17, CenturyFromYear.century(1601));
        assertEquals(19, CenturyFromYear.century(1900));
        assertEquals(18, CenturyFromYear.century(1705));
        assertEquals(20, CenturyFromYear.century(2000));

    }

}