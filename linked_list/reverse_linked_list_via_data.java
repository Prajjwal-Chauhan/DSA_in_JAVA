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

    public ListNode reverseList(ListNode head) {
        ListNode node = new ListNode();
        node = head;
        ArrayList<Integer> arr = new ArrayList<>();

        while(node != null){
            arr.add(node.val);
            node = node.next;
        }

        Collections.reverse(arr);
        node = head;
        int i = 0;
        while(node != null){
            node.val = arr.get(i);
            i++;
            node = node.next;
        }

        return head;
    }
}
