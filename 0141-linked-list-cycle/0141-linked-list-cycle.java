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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> re=new HashSet<>();
        ListNode curr=head;
        while(curr!=null ){
            if(re.contains(curr)){
                return true;
            }
            re.add(curr);
            curr=curr.next;
        }
        return false;
    }
}