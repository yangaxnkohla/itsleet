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
    public ListNode deleteMiddle(ListNode head) {
        ListNode cur = head;
        ListNode temp = head;
        
        int length = 0;        
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        
        System.out.println("length: " + length);
        
        if (length == 1) return null;
        
        int index = 0;        
        while (index != (length/2)-1) {
            cur = cur.next;
            index++;
        }
        
        cur.next = cur.next.next;
        cur = head;
        
        return cur;
    }
}