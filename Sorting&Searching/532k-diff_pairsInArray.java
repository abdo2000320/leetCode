class Solution {
    public int findPairs(int[] nums, int k) {
        //sort the array
        //time complexity O(log(n))
        Arrays.sort(nums);
        
        k = Math.abs(k);// nums[i] - nums[j] same as nums[j]-nums[i]
        int i = 0,j = 1;
        int count = 0;
        while(i<=j && j<nums.length){
             if(nums[j] - nums[i] == k && j != i){
                 count++;
                 i++; 
                 j++;
        
                 while(j<nums.length && nums[j] == nums[j-1])
                     j++;
             }
            else if(nums[j] - nums[i] > k)
                i++;
            else
                j++;
            
        }
     
        return count;
    }
}
