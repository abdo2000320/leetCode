class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length+1];
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
            if(arr[nums[i]] == 2)
                result[0] = nums[i];
        }
        for(int i=1; i<nums.length+1; i++)
            if(arr[i] == 0)
               result[1] = i;
        
        return result;
    }
}
