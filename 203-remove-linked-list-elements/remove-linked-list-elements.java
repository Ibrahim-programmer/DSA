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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode t = head;
        ListNode p = head;
        while(t != null){
            if(t.val == val){
                while(t.next != null && t.next.val == val){
                    t = t.next;
                }
                p.next = t.next;
                p = t.next;
                t = t.next;
            }
            else{
                p = t;
                t = t.next;
            }
        }
        return head;
    }
}