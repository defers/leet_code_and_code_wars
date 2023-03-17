package com.defers.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrix74Test {

    @Test
    void testSolution() {
        int[][] matrix = {{1,1}};
        var target = 2;
//        int[][] matrix = {
//                {1, 3, 5, 7},
//                {10, 11, 16, 20},
//                {23, 30, 34, 60}
//        };
//        var target = 13;
 //       var target = 6;
//        int[][] matrix = {
//                {1, 3, 5, 7},
//                {8, 9, 10, 11},
//                {12, 14, 16, 20},
//                {23, 30, 34, 60},
//                {62, 65, 67, 70}
//        };
//        var target = 30;
//
//        int[][] matrix = {
//                {1, 3, 5, 7},
//                {8, 9, 10, 11},
//                {12, 14, 16, 20},
//                {23, 30, 34, 60},
//                {62, 65, 67, 70}
//        };
//        var target = 3;

        var testClass = new SearchA2DMatrix74();
        testClass.searchMatrix(matrix, target);

    }
}