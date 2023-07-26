package org.example;

public class ReverseLinkedList206 {

    public static void main(String[] args) {
        int[] list1Values = {1,2,3,4,5};

        ListNode head = ListNode.createListNode(list1Values);
        ListNode.printListNode(reverseList(head));

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
}
