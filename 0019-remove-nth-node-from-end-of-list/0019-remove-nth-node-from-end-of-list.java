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
        if (head == null || n <= 0) {
            return head; 
        }
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        if (n>size) {
            return head;
        }
        if (size == n) {
            return head.next;
        }
        
        int i = 0;
        curr = head;
       while(curr.next!=null&& size-i-1>n){
           curr=curr.next;
           i++;
       }
        curr.next = curr.next.next;
        
        return head;
    }
}
