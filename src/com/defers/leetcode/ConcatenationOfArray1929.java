package com.defers.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        List<Integer> arrList = new ArrayList<>(nums.length * 2);
        List<Integer> numsBoxed = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        arrList.addAll(numsBoxed);
        arrList.addAll(numsBoxed);
        return arrList.stream().mapToInt(e -> e.intValue()).toArray();
    }
}
