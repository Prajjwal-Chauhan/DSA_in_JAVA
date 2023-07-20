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
        ListNode dummyhead = new ListNode();
        ListNode currnode = new ListNode();
        currnode = dummyhead;

        while(l1 != null){
        ListNode newnode = new ListNode();
        
        
        currnode.next = newnode;
        }

        return dummyhead;
    }
}
