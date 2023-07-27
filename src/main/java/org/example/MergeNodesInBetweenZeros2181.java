package org.example;

public class MergeNodesInBetweenZeros2181 {
    public static void main(String[] args) {
        int[] list1Values = {0, 1, 2, 0, 4, 5, 0};

        ListNode head = ListNode.createListNode(list1Values);
        ListNode.printListNode(mergeNodes(head));
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int sum = 0;
        while (head != null) {
            if (head.val != 0) {
                sum = sum + head.val;
            } else if (head.val == 0 && sum != 0) {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            }
            head = head.next;
        }
        return dummy.next;
    }
}

