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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode headA = list1;
        ListNode headB = list2;
        ListNode tail = dummy;

        while(headA != null && headB != null){
            if(headA.val <= headB.val){
                tail.next = headA;
                tail = tail.next;
                headA = headA.next;
            }
            else{
                tail.next = headB;
                tail = tail.next;
                headB = headB.next;
            }
        }
        if(headA != null){
            tail.next = headA;
            tail = tail.next;
            headA = headA.next;
        }
        if(headB != null){
            tail.next = headB;
            tail = tail.next;
            headB = headB.next;
        }
        return dummy.next;
    }
}