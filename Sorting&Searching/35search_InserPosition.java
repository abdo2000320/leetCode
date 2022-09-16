class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        
        int low = 0, hight = nums.length-1;
        
        if(target <= nums[low])
            return low;
        if(target > nums[hight])
            return hight+1;
        
        while(low <= hight){
           int midium = low + (hight-low)/2;
           if(target == nums[low])
                return low;
            
           else if(target == nums[hight])
                return hight;
            
           else if(target == nums[midium])
               return midium;
            
           else if(target <  nums[midium])
               hight =  midium - 1;
            
           else
               low =  midium +1;
        }
        return low;
    }
}
