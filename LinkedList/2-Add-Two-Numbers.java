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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        int carry=0;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int sum=0;
        while(list1!=null && list2!=null)
        {
            sum=list1.val+list2.val+carry;
            ListNode node=new ListNode(sum%10);
            curr.next=node;
            curr=curr.next;
            carry=sum/10;
            list1=list1.next;
            list2=list2.next;
        }

        while(list1!=null)
        {
            sum=list1.val+carry;
            ListNode node=new ListNode(sum%10);
            curr.next=node;
            curr=curr.next;
            carry=sum/10;
            list1=list1.next;
        }

        while(list2!=null)
        {
            sum=list2.val+carry;
            ListNode node=new ListNode(sum%10);
            curr.next=node;
            curr=curr.next;
            carry=sum/10;
            list2=list2.next;
        }
        if(carry>0)
        {
            ListNode node=new ListNode(carry);
            curr.next=node;
        }

        return dummy.next;
    }
}