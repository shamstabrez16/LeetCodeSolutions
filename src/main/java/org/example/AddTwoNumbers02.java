package org.example;

public class AddTwoNumbers02 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long l1Value = 0;
        int i =0;
        while (l1 != null) {
            l1Value =l1Value+ (l1.val*(int) (Math.pow(10,i)));
            i++;
            l1 = l1.next;
        }
        i =0;
        long l2Value = 0;
        while (l2 != null) {
            l2Value =l2Value+ (l2.val*(int) (Math.pow(10,i)));
            i++;
            l2 = l2.next;
        }
        long sum = l1Value+l2Value;
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        while (sum>=0){
            int val = (int) (sum%10);
            sum = sum/10;
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] list1Values = {9};
        int[] list2Values = {1,9,9,9,9,9,9,9,9,9};

        ListNode list1 = ListNode.createListNode(list1Values);
        ListNode list2 = ListNode.createListNode(list2Values);
        ListNode.printListNode(addTwoNumbers(list1,list2));
    }


}
