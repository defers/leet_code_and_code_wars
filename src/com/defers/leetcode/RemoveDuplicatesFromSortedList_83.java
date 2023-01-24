package com.defers.leetcode;

public class RemoveDuplicatesFromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {

            if (current.val == prev.val) {
                ListNode next = current.next;
                prev.next = next;
                current.next = null;
                current = next;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

