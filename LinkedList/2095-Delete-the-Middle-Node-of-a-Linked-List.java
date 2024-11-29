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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        ListNode fast=head,slow=head,superSlow=head;

        while(fast!=null && fast.next!=null)
        {
            if(superSlow.next==slow)
                superSlow=slow;
            
            slow=slow.next;
            fast=fast.next.next;
            
        }
        superSlow.next=superSlow.next.next;
        return head;
    }
}