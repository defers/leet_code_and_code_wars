package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedList_83Test {
    @Test
    public void testSolution() {
        var testClass = new RemoveDuplicatesFromSortedList_83();
        var node5 = new RemoveDuplicatesFromSortedList_83.ListNode(3, null);
        var node4 = new RemoveDuplicatesFromSortedList_83.ListNode(3, node5);
        var node3 = new RemoveDuplicatesFromSortedList_83.ListNode(2, node4);
        var node2 = new RemoveDuplicatesFromSortedList_83.ListNode(1, node3);
        var node1 = new RemoveDuplicatesFromSortedList_83.ListNode(1, node2);

        testClass.deleteDuplicates(node1);

        assertEquals(1, node1.val);
        assertEquals(2, node1.next.val);
        assertEquals(3, node1.next.next.val);
    }

}