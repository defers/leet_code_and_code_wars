package com.defers.leetcode;

//        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2
//        Example 2:
//
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
//        Example 3:
//
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4

public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        int half = (start + end) / 2;
        if (target == nums[half]) return half;
        else if (target > nums[half]) {
            start = half;
            if (half == 0) return start + 1;
            if (half == end - 1) return end;
        } else {
            end = half;
            if (end == start) return end;
        }
        return binarySearch(nums, target, start, end);
    }

    public int searchInsertLinear(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid;
                if (mid == 0) return mid;
            } else {
                start = mid;
                if (mid == 0 || start + 1 == end) return mid + 1;
            }
        }
        return start;
    }
}
