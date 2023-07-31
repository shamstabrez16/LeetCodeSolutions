package org.example;

public class DeleteNodeInALinkedList237 {

    public static void deleteNode(ListNode node) {
        if(node!=null){
            node.val= node.next.val;
            node.next = node.next.next;
        }

    }
}
