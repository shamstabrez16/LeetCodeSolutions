package org.example;

import org.example.ListNode;

public class AddTwoNumbersII {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 =reverseList(l1);
        ListNode list2 =reverseList(l2);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (list1 != null || list2 != null) {
            int sum = carry;
            if (list1 != null) {
                sum += list1.val;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum += list2.val;
                list2 = list2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            current.next = new ListNode(sum);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return reverseList(dummy.next);
    }

    public static void main(String[] args) {
        int[] list1Values = {7,2,4,3};
        int[] list2Values = {5,6,4};

        ListNode list1 = ListNode.createListNode(list1Values);
        ListNode list2 = ListNode.createListNode(list2Values);
        ListNode.printListNode(addTwoNumbers(list1,list2));
    }
}
