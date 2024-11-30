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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode curr=head;
        int temp=-101;

        while(curr!=null)
        {
            ListNode front=curr.next;
            if(front!=null && curr.val==front.val)
            {
                while(front!=null && curr.val==front.val)
                {
                    front=front.next;
                }
                if(curr==head)
                {
                    head=front;
                }
                else
                    prev.next=front;
                
                curr=front;
            }
            else
            {
                prev=curr;
                curr=front;
            }
        }
        return head;
    }
}