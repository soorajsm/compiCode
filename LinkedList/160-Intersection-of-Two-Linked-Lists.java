/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        return null;
        ListNode apointer=headA;
        ListNode bpointer=headB;
        while(apointer!=bpointer)
        {
            apointer=(apointer==null)?headB:apointer.next;
            bpointer=(bpointer==null)?headA:bpointer.next;
        }
        return apointer;
    }
}