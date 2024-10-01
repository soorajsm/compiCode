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
        ListNode curr=head;
        Stack<ListNode>stack=new Stack<>();
        while(curr!=null)
        {
            stack.push(curr);
            curr=curr.next;
        }
        ListNode thead=stack.pop();
        ListNode tcurr=thead;
        while(!stack.isEmpty())
        {
            tcurr.next=stack.pop();
            tcurr=tcurr.next;
        }
        tcurr.next=null;
        return thead;
    }
}