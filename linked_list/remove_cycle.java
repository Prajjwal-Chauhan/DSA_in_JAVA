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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = new ListNode();
        slow = head;
        ListNode fast = new ListNode();
        fast = head;

        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle = true;
                break;
            }
        }

        if(!cycle){
            return null;
        }
      ListNode n = head; 

        while(slow.next != n.next){
            slow = slow.next;
            n = n.next;
        }
      slow.next = null;

        return head;
    }
}
