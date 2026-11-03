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
    public ListNode nextNullNode(ListNode head,ListNode prev){
        if(head.next == null){
            prev.next = null;
            return head;
        }
        return nextNullNode(head.next,head);
    }
    public void reorderList(ListNode head) {
        ListNode t = head;
        ListNode nextNode ;
        while(t.next != null){
            nextNode = nextNullNode(t,null);
            nextNode.next = t.next;
            t.next = nextNode;
            t = nextNode.next ;
            if(t == null){
                break;
            }
        }
        // return head;
    }

}