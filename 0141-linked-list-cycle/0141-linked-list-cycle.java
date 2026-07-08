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
        Set<ListNode> hi=new HashSet<>();
        ListNode h=head;
        while(true)
        {
            if(h==null)
            {
                return false;
            }
            h=h.next;
            if(hi.add(h));
            else{
                return true;
            }
            
        }
    }
}