package com.defers.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnArrayOfTwoIntWhenGivenArrayOfInt() {
        var twoSum = new TwoSum();

        var nums = new int[]{2, 7, 11, 15};
        var target = 9;
        var expected = new int[]{0, 1};

        var result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}