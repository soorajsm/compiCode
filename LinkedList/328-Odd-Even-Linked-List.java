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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
            return head;
        ListNode t1=head, t2=head.next, h2=head.next;

        while(t2!=null && t2.next!=null)
        {
            t1.next=t1.next.next;
            t2.next=t2.next.next;
            t1=t1.next;
            t2=t2.next;
        }
        t1.next=h2;
        return head;
    }
}



































// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         if(head==null || head.next==null)
//             return head;

//         ListNode first=head;
//         ListNode second=head.next;
//         ListNode secHead=second;

//         while(second!=null && second.next!=null)
//         {

//                 first.next=first.next.next;
//                 first=first.next;

//                 second.next=second.next.next;
//                 second=second.next;
//         }
//         first.next=secHead;
//         return head;
//     }
// }