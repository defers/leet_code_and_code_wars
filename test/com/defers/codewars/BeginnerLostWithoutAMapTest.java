package com.defers.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeginnerLostWithoutAMapTest {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, BeginnerLostWithoutAMap.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, BeginnerLostWithoutAMap.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, BeginnerLostWithoutAMap.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

}