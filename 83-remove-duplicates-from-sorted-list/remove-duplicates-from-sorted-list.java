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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev = head;
        while(temp != null){
            while(temp != null && temp.val == prev.val){
                temp = temp.next;
            }
            prev.next = temp;
            if(temp != null)
            prev = temp;

        }
        
        // prev.next = null;
        return head;
    }

}