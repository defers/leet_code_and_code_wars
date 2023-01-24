package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringIII_557Test {
    @Test
    public void testSolution() {
        var testClass = new ReverseWordsInAStringIII_557();
        assertEquals("s'teL ekat edoCteeL tsetnoc", testClass.reverseWords("Let's take LeetCode contest"));
    }

}