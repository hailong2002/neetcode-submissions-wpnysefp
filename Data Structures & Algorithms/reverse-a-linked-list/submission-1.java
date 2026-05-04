
 //Definition for singly-linked list.

 

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head;
        while (curr.next != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } ;
        curr.next = prev;
        return curr;
    }
}
