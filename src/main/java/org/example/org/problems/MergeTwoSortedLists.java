package org.example.org.problems;

import org.example.org.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<ListNode> order = new ArrayList<>();

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 != null && list2 == null) {
            return list1;
        } else if (list1 == null) {
            return list2;
        }

        ListNode list1Current = list1;
        ListNode list2Current = list2;
        ListNode temp;
        while (list1Current != null && list2Current != null) {
            if (list1Current.val <= list2Current.val) {
                temp = list1Current.next;
                order.add(list1Current);
                list1Current = temp;
            } else {
                temp = list2Current.next;
                order.add(list2Current);
                list2Current = temp;
            }
        }

        ListNode rest = list1Current == null ? list2Current: list1Current;
        order.add(rest);
        for (int i = 0; i < order.size() - 1; i++) {
            order.get(i).next = order.get(i + 1);
        }

        return order.get(0);
    }
}
