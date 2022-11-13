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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode output = result;
        int remaining = 0;
        int sum = 0;
        while(l1 != null && l2 != null){
            sum =(remaining + l1.val + l2.val) % 10;
            remaining = (remaining + l1.val + l2.val - sum) / 10;
            result.val = sum;
            l1 = l1.next;
            l2 = l2.next;
            if(l1 != null && l2 != null){
                result.next = new ListNode(-1);
                result = result.next;
            }
        }
        if((l1 != null && l2 == null)){
            while(l1 != null){
                sum =(remaining + l1.val) % 10;
                remaining = (remaining + l1.val - sum) / 10;
                result.next = new ListNode(-1);
                result = result.next;
                result.val = sum; 
                l1 = l1.next;
            }
        }else if(l1 == null && l2 != null){
           while(l2 != null){
                sum =(remaining + l2.val) % 10;
                remaining = (remaining + l2.val - sum) / 10;
                result.next = new ListNode(-1);
                result = result.next;
                result.val = sum; 
                l2 = l2.next;
           }
        }
        if(remaining != 0){
            result.next = new ListNode(-1);
            result.next.val = remaining;
        } 
    
        return output;
    }
}
