package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveLinkedListElements203Test {
    @Test
    public void testSolution() {
        var testClass = new RemoveLinkedListElements203();
        var node7 = new RemoveLinkedListElements203.ListNode(6, null);
        var node6 = new RemoveLinkedListElements203.ListNode(5, node7);
        var node5 = new RemoveLinkedListElements203.ListNode(4, node6);
        var node4 = new RemoveLinkedListElements203.ListNode(3, node5);
        var node3 = new RemoveLinkedListElements203.ListNode(6, node4);
        var node2 = new RemoveLinkedListElements203.ListNode(2, node3);
        var node1 = new RemoveLinkedListElements203.ListNode(1, node2);

        testClass.removeElements(node1, 6);

        assertEquals(1, node1.val);
        assertEquals(2, node1.next.val);
        assertEquals(3, node1.next.next.val);
        assertEquals(4, node1.next.next.next.val);
        assertEquals(5, node1.next.next.next.next.val);
        assertNull(node1.next.next.next.next.next);
    }
}