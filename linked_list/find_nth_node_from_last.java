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

        return curr.val;
    }
}
