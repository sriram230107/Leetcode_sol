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
    if(head == null || head.next == null || k == 0)
        return head;
    int count = 1;
    ListNode l = head;
    while(l.next != null)
    {
        l = l.next;
        count++;
    }
    k%=count;
    l.next=head;
    ListNode n=head;
    for(int i=1;i<count-k;i++)
    {
        n=n.next;
    }
    head=n.next;
    n.next=null;
    return head;
    }
}