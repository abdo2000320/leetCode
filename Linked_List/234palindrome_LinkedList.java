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
        //case when linkedList empty or contains 1 node
        if(head==null || head.next == null)
            return true;
        
        ListNode fakeHead = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(fakeHead != null){
            stack.push(fakeHead.val);
            fakeHead = fakeHead.next;
        }
        
        while(head != null){
            if(head.val != stack.pop())
                return false;
            head = head.next;
        }
        
        return true;
    }
}
