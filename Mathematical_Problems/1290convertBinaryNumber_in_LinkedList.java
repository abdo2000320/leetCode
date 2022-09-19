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
    
    static int binaryToInteger(String binary){
        char[] numbers = binary.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;
    }
    
    public int getDecimalValue(ListNode head) {
        //loop over the linked list, then initialize a stringBuilder by its values
        StringBuilder str = new StringBuilder();
        ListNode current = head;
        while(current != null){
            str.append(current.val);
            current = current.next;
        }
        //convert the string of binary to an Integer by helper function
        return binaryToInteger(str.toString());
    }
}
