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
       ListNode newn=new ListNode();
       ListNode ne=newn;
       while(list1 !=null && list2 !=null)
       {
        if(list1.val<=list2.val)
        {
            ne.next=list1;
            list1=list1.next;
        }
        else
        {
            ne.next=list2;
            list2=list2.next;
        }
        ne=ne.next;
       }
       ne.next=(list1==null)?list2:list1;
       return newn.next;
   }
}