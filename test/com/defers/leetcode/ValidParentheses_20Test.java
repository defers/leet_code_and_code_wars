package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParentheses_20Test {
    @Test
    public void testSolution() {
        ValidParentheses_20 testClass = new ValidParentheses_20();
        assertTrue(testClass.isValid("()"));
        assertTrue(testClass.isValid("()[]{}"));
        assertFalse(testClass.isValid("(]"));
        assertTrue(testClass.isValid("{[]}"));
        assertFalse(testClass.isValid("([)]"));
    }
}