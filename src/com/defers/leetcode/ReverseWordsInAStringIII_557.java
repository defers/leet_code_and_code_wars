package com.defers.leetcode;

//        Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//
//
//        Example 1:
//
//        Input: s = "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
//        Example 2:
//
//        Input: s = "God Ding"
//        Output: "doG gniD"
//
//
//        Constraints:
//
//        1 <= s.length <= 5 * 104
//        s contains printable ASCII characters.
//        s does not contain any leading or trailing spaces.
//        There is at least one word in s.
//        All the words in s are separated by a single space.

public class ReverseWordsInAStringIII_557 {
    public String reverseWords(String s) {
        String[] sentences = s.split(" ");
        String[] resultArr = new String[sentences.length];
        for (int sentNum = 0; sentNum < sentences.length; sentNum++) {
            char[] letters = sentences[sentNum].toCharArray();
            char[] reversedLetters = new char[letters.length];
            int j = 0;
            for (int i = letters.length-1; i >= 0; i--) {
                reversedLetters[j] = letters[i];
                j++;
            }
            resultArr[sentNum] = String.valueOf(reversedLetters);
        }
        return String.join(" ", resultArr);
    }
}
