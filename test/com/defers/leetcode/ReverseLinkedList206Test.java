package com.defers.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedList206Test {

    @Test
    void testSolution() {
        ReverseLinkedList206.ListNode node5 = new ReverseLinkedList206.ListNode(5, null);
        ReverseLinkedList206.ListNode node4 = new ReverseLinkedList206.ListNode(4, node5);
        ReverseLinkedList206.ListNode node3 = new ReverseLinkedList206.ListNode(3, node4);
        ReverseLinkedList206.ListNode node2 = new ReverseLinkedList206.ListNode(2, node3);
        ReverseLinkedList206.ListNode node1 = new ReverseLinkedList206.ListNode(1, node2);

        var testClass = new ReverseLinkedList206();
        ReverseLinkedList206.ListNode reverseHead = testClass.reverseList(node1);
        Assertions.assertEquals(5, reverseHead.val);
        Assertions.assertEquals(4, reverseHead.next.val);
        Assertions.assertEquals(3, reverseHead.next.next.val);
        Assertions.assertEquals(2, reverseHead.next.next.next.val);
        Assertions.assertEquals(1, reverseHead.next.next.next.next.val);
    }
}