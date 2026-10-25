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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head ;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int pos = 1;
        while(temp1 != null && temp2 != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos++;
        }
        if(temp1 == null){
            head = l2;
            temp1 = l2;
            temp2 = l1;
        }
        else{
            head = l1;
            temp1 = l1;
            temp2 = l2;
        }

        int carry = 0;
        int i = 1;
        // int current = 1;
        // temp1 = largeHead;
        int sum ;
        while(temp1 != null){
            if(i < pos){
                sum = temp1.val + temp2.val + carry;
                temp2 = temp2.next;
            }
            else{
                sum = temp1.val + carry;
            }
            temp1.val = sum % 10;
            carry = (sum / 10 == 1)? 1 : 0;
            if(temp1.next == null && carry == 1){
                temp1.next = new ListNode(1);
                break;
            }
            temp1 = temp1.next;
            i++;

        }
        
        return head;
    }
}