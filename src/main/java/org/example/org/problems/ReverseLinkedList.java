package org.example.org.problems;

import org.example.org.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) { return null; }
        List<ListNode> list = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(list.size() - 1 - i).next = list.get(list.size() - i - 2);
        }
        list.get(0).next = null;
        return list.get(list.size() - 1);
    }
}
