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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = 0;
        ListNode t = head;
        while(t != null){
            total++;
            t = t.next;
        }
        int pos = 0;
        if(n== 1 && total == 1 ){
            return null;
        }
        if(total == n){
            return head.next;
        }
        t = head;
        ListNode p = t;

        while(pos != total - n ){
            p = t;
            t = t.next;
            pos++;
        }
        
        p.next = t.next;
        return head;
    }
}