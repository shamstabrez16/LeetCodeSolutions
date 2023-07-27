package org.example;

public class MaximumTwinSumOfALinkedList2130 {

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
    public static void main(String[] args) {
        int[] list1Values = {7,57,13,31,17,65,32,3,97,22,7,20,69,35,69,75,13,33,50,80,64,71,15,28,2,27,39,48,13,22,84,5,51,46,26,78,56,63};
        ListNode head = ListNode.createListNode(list1Values);
        System.out.println(pairSum(head));
    }


    public static  int pairSum(ListNode head) {

        int[] val = new int[100000];
        int i =0;
        while (head!=null){
            val[i]=head.val;
            head=head.next;
            i++;
        }

        int max=0;
        //7,57,13,31,17,65,32,3,97,22,7,20,69,35,69,75,13,33,50,80,64,71,15,28,2,27,39,48,13,22,84,5,51,46,26,78,56,63
        for (int j = 0; j <= i; j++,i--) {
            int x= val[j];
            int y = val[i-1];
            int sum = val[j]+val[i-1];
            max= Math.max(max,sum);
        }
        return max;
    }
}
