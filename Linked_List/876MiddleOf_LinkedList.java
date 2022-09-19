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
    public ListNode middleNode(ListNode head) {
        //first we traverse the linkedList and store references in an list
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode current = head;
        while(current != null){
            list.add(current);
            current = current.next;
        }
    
        //then return th middle
        return list.get(list.size()/2);
    }
}
