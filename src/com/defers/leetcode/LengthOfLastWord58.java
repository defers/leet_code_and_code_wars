package com.defers.leetcode;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] res = s.split("\\s+");
        return res[res.length-1].length();
    }
}
