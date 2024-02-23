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
    public int SizeOfList(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        
        int n = SizeOfList(head);
        
        if(n == 1)
            return head;
        k = k % n;
        int flag = 0;
        while(flag < k){
            ListNode pre = head;
            ListNode nex = head.next;
            while(nex.next != null){
                pre = pre.next;
                nex = nex.next;
            }
            nex.next = head;
            head = nex;
            pre.next = null;
            flag++;
        }
        return head;
    }
}