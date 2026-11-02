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
        if(head == null) return false;
        ListNode t = head;
        ListNode f = head.next;
        while(f != null && f.next != null){
            t = t.next;
            f  = f.next.next;
            if(t == f){
                return true;
            }
        }
        return false;
    }
}