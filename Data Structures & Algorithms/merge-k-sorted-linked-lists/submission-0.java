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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode head : lists){
            if(head != null){
                pq.add(head);
            }
        }
        while(tail != null){
            ListNode addition = pq.poll();
            if(addition != null && addition.next != null){
                pq.add(addition.next);
            }
            tail.next = addition;
            tail = tail.next;
        }
        return dummy.next;
    }
}
