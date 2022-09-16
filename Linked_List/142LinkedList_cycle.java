 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<ListNode,Integer>();    
        ListNode current = head;
        while(current != null){
            if(map.containsKey(current))//if we come back to a node already traversed
                return current;
            
            map.put(current,current.val);
            current = current.next;
        }
        return null;
    }
}
