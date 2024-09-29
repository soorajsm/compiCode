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
        ListNode apointer=headA;
        ListNode bpointer=headB;
        Set<ListNode>set=new HashSet<>();
        while(apointer!=null && bpointer!=null)
        {
            while(apointer!=null)
            {
                if(!set.add(apointer))
                    return apointer;
                apointer=apointer.next;
            }

            while(bpointer!=null)
            {
                if(!set.add(bpointer))
                    return bpointer;
                bpointer=bpointer.next;
            }
        }
        return null;
    }
}