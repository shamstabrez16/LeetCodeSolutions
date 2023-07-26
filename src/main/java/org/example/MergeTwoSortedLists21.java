package org.example;

public class MergeTwoSortedLists21 {

    public static void main(String[] args) {
        int[] list1Values = {1, 2, 4};
        int[] list2Values = {1, 3, 4};

        ListNode list1 = createListNode(list1Values);
        ListNode list2 = createListNode(list2Values);
        System.out.println(mergeTwoLists(list1,list2));
    }

    public static ListNode createListNode(int... values) {
        if (values.length == 0) {
            return new ListNode(0);
        }

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummyHead.next;
    }
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode last = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ListNode n = new ListNode(list1.val);
                n.next = last;
                last = n;
                //last = last.next;
                list1 = list1.next;
            } else {
                ListNode n = new ListNode(list2.val);
                n.next = last;
                last = n;
                list2 = list2.next;
//                n.next = head;
//                head = n;
//                list2= list2.next;next
            }
        }

        while (list1 != null) {
            ListNode n = new ListNode(list1.val);
            n.next = last;
            last = n;
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode n = new ListNode(list2.val);
            n.next = last;
            last = n;
            list2 = list2.next;

        }
        ListNode prev = null;
        ListNode current = last;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        last = prev;
        return last;
    }
}
