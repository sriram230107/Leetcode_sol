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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ln=new ListNode();
        ListNode h=head;
        ListNode temp=head;
        while(!(h==null))
        {
            
            if(h.val==val && h==head)
            {
                head=h.next;
                temp = head;
                h=h.next;
            }
            else if(h.val==val){
                temp.next=h.next;
                h=h.next;
            }
            else
            {
                temp=h;
                h=h.next;
            }
        }
        return head;
    }
}