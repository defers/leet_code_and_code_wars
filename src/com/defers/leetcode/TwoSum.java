package com.defers.leetcode;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var res = new int[2];
        Arrays.sort(nums);
        for (var i = 0; i < nums.length; i++) {
            for (var j = i+1; j < nums.length; j++) {
                System.out.println("res: " + nums[i] + " " + nums[j]);
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }
}
