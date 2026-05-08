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
      public void reorderList(ListNode head) {
    int n = 1;
    ListNode start = head;
    while (start.next != null) {
      n += 1;
      start = start.next;
    }
    ListNode curr = head;
    int j = 1;
    while (j < n) {
      int i = j;
      ListNode temp = head;
      ListNode nextTemp = head;
      while (i > 0) {
        nextTemp = nextTemp.next;
        i--;
      }
//      i = j;
      i = 1 ;
      while (n - i > 0) {
        temp = temp.next;
        i++;
      }
      curr.next = temp;
      curr.next.next = nextTemp;
      curr = curr.next.next;
      j += 2;
    }
    curr.next = null;
  }
}
