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
    
    public static void breaking(ArrayList<Integer> arr,ListNode l){
        if(l == null){
            return;
        }
        arr.add(l.val);
        breaking(arr,l.next);
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
   
        ListNode current = new ListNode();
        current = head;
        ArrayList<Integer> arr = new ArrayList<>();
        breaking(arr,current);
        
        if(arr.size()%2 != 0){
            arr.remove(arr.size()/2);
        }
        
        for(int i = 0 ; i < arr.size()/2 ; i++){
                if(arr.get(i) != arr.get(arr.size() - 1 - i)){
                    return false;
                }
            }
        return true;
    }
}
