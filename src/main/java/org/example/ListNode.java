package org.example;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public static void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
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

}
