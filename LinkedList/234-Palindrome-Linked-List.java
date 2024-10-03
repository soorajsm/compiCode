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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
            return true;
        if(head.next.next==null)
        {
            if(head.val==head.next.val)
                return true;
            return false;
        }

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode curr=slow.next;
        slow.next=null;
        ListNode front=null;

        while(curr!=null)
        {
            front=curr.next;
            curr.next=slow;
            slow=curr;
            curr=front;
        }

        while(slow!=null)
        {
            if(slow.val==head.val)
            {
                slow=slow.next;
                head=head.next;
            }
            else
                return false;
        }
        return true;
    }
}