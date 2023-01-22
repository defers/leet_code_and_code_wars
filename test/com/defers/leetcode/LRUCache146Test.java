package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCache146Test {
    @Test
    public void lRUTest() {
        LRUCache146 lRUCache = new LRUCache146(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        // return 1
        assertEquals(1, lRUCache.get(1));
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        // returns -1 (not found)
        assertEquals(-1, lRUCache.get(2));
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        // return -1 (not found)
        assertEquals(-1, lRUCache.get(1));
        // return 3
        assertEquals(3, lRUCache.get(3));
        // return 4
        assertEquals(4, lRUCache.get(4));
    }
}