package org.example;

public class AddTwoNumbers02 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            current.next = new ListNode(sum);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] list1Values = {9};
        int[] list2Values = {1,9,9,9,9,9,9,9,9,9};

        ListNode list1 = ListNode.createListNode(list1Values);
        ListNode list2 = ListNode.createListNode(list2Values);
        ListNode.printListNode(addTwoNumbers(list1,list2));
    }


}
