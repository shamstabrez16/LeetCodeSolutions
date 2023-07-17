package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        LargestSubString largestSubString = new LargestSubString();
        largestSubString.getLargestSubString("achabbbbbaa");
        PalindromeLinkedList234  palindromeLinkedList234 = new PalindromeLinkedList234();
        ListNode node4 = new ListNode(1);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // Assign the head reference
        ListNode head = node1;

        // Print the linked list values
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        //palindromeLinkedList234.isPalindrome(head);
//       ReverseString_344 reverseString344 = new ReverseString_344();
//        char[] s = {'H', 'e', 'l', 'l', 'o'};
//        reverseString344.reverseString(s);
    }
}