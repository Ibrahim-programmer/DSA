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
    public ListNode deleteMiddle(ListNode head) {
        int n=0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        if(n==1){
            return null;
        }
        temp = head;
        ListNode prev = head;
        int count =0;
        while(count != (n/2) ){
            prev = temp;
            temp = temp.next;
            count++;
        }
        temp =temp.next;
        prev.next = temp;
        return head;
    }
}