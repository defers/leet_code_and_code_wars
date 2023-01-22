package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatenationOfArray1929Test {
    @Test
    public void testFunc() {
        ConcatenationOfArray1929 arrConc = new ConcatenationOfArray1929();
        assertArrayEquals(new int[]{1,2,1,1,2,1}, arrConc.getConcatenation(new int[]{1,2,1}));
    }



}