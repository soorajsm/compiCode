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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        else if(head.next==null)
            return head;
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode front=curr.next;
        prev.next=null;
        while(curr!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=front;
            front=(front==null)?front:front.next;
        }
        return prev;
    }
}