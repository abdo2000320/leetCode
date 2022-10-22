class Solution {
    public int[] sortedSquares(int[] nums) {
    int temp;
      //sort the absolute vlaues of the array 
      for(int i=0; i<nums.length ; i++){
           for(int j=0 ; j<nums.length; j++){
               if(Math.abs(nums[i]) < Math.abs(nums[j])){
                   temp = Math.abs(nums[i]);
                   nums[i] = Math.abs(nums[j]);
                   nums[j] = temp; 
               }
           }
      }

      for(int i=0; i<nums.length ; i++){
          nums[i] = nums[i]*nums[i];
      }
      return nums;
      /**
       //optimal solution ith 2 pointer approach
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
  }
       */
    }

}
