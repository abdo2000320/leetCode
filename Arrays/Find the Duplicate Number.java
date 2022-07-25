
class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] count = new int[len+1];
        for(int i=0;i<len;i++){
            count[nums[i]]++;
            if(count[nums[i]]>1)
                return nums[i];
        }
        
        
      return 0;  
    }
}
