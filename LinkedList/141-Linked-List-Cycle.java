/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;

        ListNode slowpointer=head;
        ListNode fastpointer=head;

        while(fastpointer!=null && fastpointer.next!=null)
        {
            slowpointer=slowpointer.next;
            fastpointer=fastpointer.next.next;
            if(slowpointer==fastpointer)
                return true;
        }
        return false;
    }
}

