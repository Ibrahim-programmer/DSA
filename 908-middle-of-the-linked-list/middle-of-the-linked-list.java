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
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        } 

        int middle = (n / 2) + 1;
        int pos = 1;
        temp = head;
        ListNode prev = head;
        while(pos++ != middle){
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
        head = temp;
        return head;
    }
}