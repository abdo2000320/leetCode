class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int curs1 = 0 , curs2 = len-1, tmp,count;
        
        for(int i=0;i<len;i++){
          if(curs1 == curs2)
                break;
          while(nums[i] != 1 ){
                 count = 0;
                 if(nums[i] == 2 && curs2 >= i && curs1 != curs2){
                     nums[i] = nums[curs2];
                     nums[curs2] = 2;
                     curs2--;
                     count++;
                   }
             
                 if(nums[i] == 0 && curs1<=i && curs1 != curs2){
                     nums[i] = nums[curs1];
                     nums[curs1] = 0;
                     curs1++;
                     count++;
                   }
                 if(count == 0)
                     break;
          }  
  
        }
        
    }
}
