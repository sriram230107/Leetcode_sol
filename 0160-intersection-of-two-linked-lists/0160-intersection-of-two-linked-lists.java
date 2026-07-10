/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hl=new HashSet<>();
        ListNode l1=headA;
        ListNode l2=headB;
        while(l1!=null)
        {
            hl.add(l1);
            l1=l1.next;
        }
        while(hl.add(l2)!=false && l2!=null)
        {
            l2=l2.next;
        }
       // return l2!=null?l2:l2;
       return l2;
        
    }
}