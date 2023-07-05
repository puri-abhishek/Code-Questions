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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode L = head, R = reverse(slow);
        
        while(R != null){
            if(L.val == R.val){
                L = L.next;
                R = R.next;
            }
            else
                return false;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode temp =  curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}