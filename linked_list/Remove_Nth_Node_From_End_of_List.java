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
        if(head == null) return head;

        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }

        count -= n;
        if(count == 0) return head.next;
        curr = head;
        while(count-->1){
            curr = curr.next;
        } 

        if(curr.next == null) return null;

        curr.next = curr.next.next;

        return head;
    }
}