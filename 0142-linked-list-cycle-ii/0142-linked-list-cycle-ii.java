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
    public ListNode detectCycle(ListNode head) {
        if( head==null || head.next==null){
            return null;
        }
        HashMap<ListNode,Integer> re=new HashMap<>();
        ListNode curr=head;
        Integer index=null;
        while(curr!=null){
            if(re.containsKey(curr)){
                return curr;
            }
            re.put(curr,index);
            curr=curr.next;
        }
        return null;
    }
}