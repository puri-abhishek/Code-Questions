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
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int i = 0, j = 0;
        
        while(temp1 != null){
            i++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            j++;
            temp2 = temp2.next;
        }
        while(i>j){
            headA = headA.next;
            i--;
        }
        while(j>i){
            headB=headB.next;
            j--;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}