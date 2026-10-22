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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode nth = dummy;
        ListNode curr = dummy;
        for(int i = 0; i <= n; i++){
            nth = nth.next;
        }
        
        while(nth != null){
            curr = curr.next;
            nth  = nth.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}
