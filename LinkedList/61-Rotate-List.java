/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        ListNode curr=head;
        int len=0;
        if(head==null || head.next==null)
            return head;
        while(tail.next!=null)
        {
            len++;
            tail=tail.next;
        }
        len++;
        k=k%len;
        if(k==0)
            return head;
        int pos=len-k-1;
        while(pos-->0)
            curr=curr.next;

        ListNode thead=curr.next;
        curr.next=null;
        tail.next=head;
        return thead;
    }
}