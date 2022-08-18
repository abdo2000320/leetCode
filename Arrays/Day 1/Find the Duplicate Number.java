//Find duplicate Numbers in an array
class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] counter = new int[len+1];
        for(int i=0;i<len;i++){
            counter[nums[i]]++;
            if(counter[nums[i]]>1)
                return nums[i];
        }
        
        
      return 0;  
    }
}
