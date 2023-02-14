package com.defers.other;

import java.util.Arrays;

// Обход двухмерного массива по спирали и вывод результата в консоль

public class SpiralArray {
    public void doSpiral(int[][] arr) {
        while (true) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.println(arr[0][i]);
            }
            arr = Arrays.copyOfRange(arr, 1, arr.length);
            if (arr.length == 0) break;
            arr = rotateArray(arr);
        }
    }

    private int[][] rotateArray(int[][] arr) {
        var newArr = new int[arr[0].length][arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = arr[0].length;
            int s = 0;
            for (int j = len-1; j >= 0; j--) {
                newArr[s][k] = arr[i][j];
                s++;
            }
            k++;
        }
        return newArr;
    }
}
