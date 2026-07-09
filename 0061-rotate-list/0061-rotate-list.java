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
    public ListNode rotateRight(ListNode head, int k) {
        int count=1;
        ListNode l=head;
        while(!(l==null || l.next==null))
        {
            l=l.next;
            count++;
        }
        k%=count;
        if(head==null || head.next==null|| k==0)
        return head;
        ListNode temp=null;
        for(int i=0;i<k;i++)
        {
            ListNode h=head;
            while(h.next!=null){
                temp=h;
                h=h.next;
            }
            h.next=head;
            head=h;
            temp.next=null;

        }
        return head;
        
    }
}