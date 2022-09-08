class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length , cursor = 0  ;
        for(int i=0;i<len;i++){
       
            if(nums[i] == val){
              continue;
            }
            nums[cursor] = nums[i];
            cursor++;
        }
        
        return cursor;
    }
}