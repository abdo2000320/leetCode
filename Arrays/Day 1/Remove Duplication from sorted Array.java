//wRemove Duplication from sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length , cursor = 0  , pass;
        //parse input
        for(int i=0;i<len;i++){
            pass=0;
            for(int j=0;j<i;j++){
                if(nums[i] == nums[j]){
                   pass = 1;
                   break;
                }
            }
               if(pass == 1){
                  continue;
               }
                nums[cursor] = nums[i];
                cursor++;
        }
        return cursor;
    }
}
