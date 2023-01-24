package com.defers.leetcode;

public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        head = removeRecurse(head, head, null, val);
        return head;
    }

    private ListNode removeRecurse(ListNode head, ListNode node, ListNode prev, int val) {
        if (head == null || node == null) return head;
        ListNode next = node.next;

        if (node.val == val) {
            node.next = null;
            if (prev != null) prev.next = next;
            if (head == node) head = next;
        } else {
            prev = node;
        }
        return removeRecurse(head, next, prev, val);
    }

    static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
