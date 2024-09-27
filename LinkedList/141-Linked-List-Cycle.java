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
        ListNode cur=head;
        Set<ListNode>set=new HashSet<>();
        while(cur.next!=null)
        {
            if(!set.add(cur))
            {
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
}

