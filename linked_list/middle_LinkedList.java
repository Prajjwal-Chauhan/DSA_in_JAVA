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
        if(head.next == null){
            return head;
        }
        if(head.next.next == null){
            return head.next;
        }
        int n = 0;
        ListNode current = new ListNode();
        current = head;
        
        while(current != null){
            n++;
            current = current.next;
        }
        current = head;
        int i = 0;
        while(i != n/2){
            current = current.next;
            i++;
        }
        return current;
    }
}
