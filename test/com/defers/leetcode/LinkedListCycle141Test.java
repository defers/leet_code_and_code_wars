package com.defers.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycle141Test {

    @Test
    void testSolution() {
        var node1 = new LinkedListCycle141.ListNode(3);
        var node2 = new LinkedListCycle141.ListNode(2);
        var node3 = new LinkedListCycle141.ListNode(0);
        var node4 = new LinkedListCycle141.ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        var testClass = new LinkedListCycle141();
        boolean hasCycle = testClass.hasCycle(node1);
        assertTrue(hasCycle);
    }
}