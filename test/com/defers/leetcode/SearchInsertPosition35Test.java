package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPosition35Test {
    @Test
    public void testSolutionRecursive() {
        SearchInsertPosition35 testClass = new SearchInsertPosition35();
        assertEquals(2, testClass.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(3, testClass.searchInsert(new int[]{1,3,5,6}, 6));
        assertEquals(5, testClass.searchInsert(new int[]{1,3,5,6,8,10,14}, 10));
        assertEquals(0, testClass.searchInsert(new int[]{1,3,5,6,8,10,14}, 1));
        assertEquals(1, testClass.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, testClass.searchInsert(new int[]{1,3,5,6}, 7));
        assertEquals(0, testClass.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void testSolutionLinear() {
        SearchInsertPosition35 testClass = new SearchInsertPosition35();
        assertEquals(2, testClass.searchInsertLinear(new int[]{1,3,5,6}, 5));
        assertEquals(3, testClass.searchInsertLinear(new int[]{1,3,5,6}, 6));
        assertEquals(0, testClass.searchInsertLinear(new int[]{1,3,5,6}, 1));
        assertEquals(5, testClass.searchInsertLinear(new int[]{1,3,5,6,8,10,14}, 10));
        assertEquals(0, testClass.searchInsertLinear(new int[]{1,3,5,6,8,10,14}, 1));
        assertEquals(1, testClass.searchInsertLinear(new int[]{1,3,5,6}, 2));
        assertEquals(4, testClass.searchInsertLinear(new int[]{1,3,5,6}, 7));
        assertEquals(0, testClass.searchInsertLinear(new int[]{1,3,5,6}, 0));
    }
}