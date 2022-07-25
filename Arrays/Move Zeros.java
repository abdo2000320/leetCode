class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length , flag ;
        for(int i=0;i<len;i++){
            if(nums[i] == 0){
                flag = 0;
                for(int j=i+1;j<len;j++){
                    if(nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        flag = 1;
                        break;
                    }
                }
               if(flag == 0)
                break;
            }
           
        }
        
    }
}