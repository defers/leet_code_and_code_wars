package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWord58Test {
    @Test
    public void testSolution() {
        var testClass = new LengthOfLastWord58();
        assertEquals(4, testClass.lengthOfLastWord("   fly me   to   the moon  "));
    }
}