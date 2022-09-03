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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
        
       //Iterative approach
       
        ListNode listMerge = new ListNode(0);
        ListNode head = listMerge;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                head.next = list1;
                list1 = list1.next;
            }else{
                head.next = list1;
                list2 = list2.next;
            }
            
            head = head.next;
        }
        
        
        if(list1 != null){
            head.next = list1;
        }else if(list2 != null){
            head.next = list2;
        }
        
        return listMerge.next;
        */
        
        /**
        *Recursion approach
        */
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode merge;
       
        if(list1.val <= list2.val){
            merge = list1;
            merge.next = mergeTwoLists(list1.next,list2);
        }else{
            merge = list2;
            merge.next = mergeTwoLists(list1,list2.next);
        }
            
        return merge;
        }
        
    }

