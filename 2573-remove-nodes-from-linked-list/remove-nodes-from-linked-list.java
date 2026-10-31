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
    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode t = head;
        ListNode p = null;
        ListNode f = null;
        while(t != null){
            f = t.next;
            t.next = p;
            p = t;
            t = f;
        }
        return p;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode c1 = head;
        ListNode c2 = head.next;
        while(c2 != null){
            if(c2.val < c1.val){
                c1.next = c2.next;
                c2 = c2.next;

            }
            else{
                c1.next = c2;
                c1 = c2;
                c2 = c1.next;
            }

        }
        if(c1 == head){
            return c1;
        }
        c1.next = null;
        //head = reverse(head)
        
        return reverse(head);
    }
}