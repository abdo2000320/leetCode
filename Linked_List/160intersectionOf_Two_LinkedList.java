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
    
     private int length(ListNode node) {
      //TC O(N+M)
      //SC O(1)
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA), lenB = length(headB);
        // move headA and headB to the same start point
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenA < lenB) {
            headB = headB.next;
            lenB--;
        }
        // find the intersection until end
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    
 
        /*
        //TC : O(N+M)
        //SC : O(M)
        if(headA == null || headB == null)
            return null;
        
        Set<ListNode> set = new HashSet<ListNode>();
        
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(!set.add(headB))
                return headB;
            headB = headB.next;
        }
        return null;
        */
    }

}
