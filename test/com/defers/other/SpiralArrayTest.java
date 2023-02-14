package com.defers.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralArrayTest {

    @Test
    void doSpiral() {
        int[][] arr = {
            {9, 8, 7},
            {2, 1, 6},
            {3, 4, 5}
        };
        SpiralArray sa = new SpiralArray();

        sa.doSpiral(arr);
    }
}