package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void testSolution() {
        var arr = new int[]{7,1,5,3,6,4};
        var arr2 = new int[]{7,6,4,3,1};
        var arr3 = new int[]{2,4,1};

        var testClass = new BestTimeToBuyAndSellStock();

        assertEquals(5, testClass.maxProfit(arr));
        assertEquals(0, testClass.maxProfit(arr2));
        assertEquals(2, testClass.maxProfit(arr3));
    }

}