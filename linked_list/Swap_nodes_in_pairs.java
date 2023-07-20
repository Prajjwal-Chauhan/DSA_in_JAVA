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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummyhead = new ListNode();
        dummyhead = head.next;
        head.next = dummyhead.next;
        dummyhead.next = head;
        
        if(dummyhead.next == null){
            return dummyhead;
        }

        ListNode ptr1 = new ListNode();
        ListNode ptr2 = new ListNode();
        ptr1 = head.next;
        //ptr2 = ptr1.next;

        while(ptr1 != null && ptr1.next != null){
            ptr2 = ptr1.next;
            head.next = ptr2;
            ptr1.next = ptr2.next;
            ptr2.next = ptr1;
            ptr1 = ptr1.next;
            head = head.next.next;
        }

        return dummyhead;
    }
}
