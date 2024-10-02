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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;

        if(head.next==null)
            return head;

        ListNode first=head;
        ListNode second=head.next;
        ListNode secHead=second;

        while(first.next!=null && first.next.next!=null || second.next!=null && second.next.next!=null)
        {
            if(first.next!=null && first.next.next!=null)
            {
                first.next=first.next.next;
                first=first.next;
            }

            if(second.next!=null && second.next.next!=null)
            {
                second.next=second.next.next;
                second=second.next;
            }
        }
        first.next=secHead;
        second.next=null;
        return head;
    }
}