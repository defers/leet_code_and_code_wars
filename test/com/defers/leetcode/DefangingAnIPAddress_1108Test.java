package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefangingAnIPAddress_1108Test {
    @Test
    public void defangIPaddr() {
        DefangingAnIPAddress_1108 testClass = new DefangingAnIPAddress_1108();
        assertEquals("1[.]1[.]1[.]1", testClass.defangIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", testClass.defangIPaddr("255.100.50.0"));
    }

}