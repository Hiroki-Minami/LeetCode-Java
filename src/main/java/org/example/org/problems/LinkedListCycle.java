package org.example.org.problems;

import org.example.org.util.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) { return false; }
        ListNode rabbit = head.next;
        ListNode turtle = head;

        while (rabbit != null) {
            if (rabbit == turtle) { return true; }
            turtle = turtle.next;
            rabbit = rabbit.next == null ? null: rabbit.next.next;
        }
        return false;
    }
}
