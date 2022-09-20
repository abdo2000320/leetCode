class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        // To store the result
          int N = arr.length;
          int minlength = Integer.MAX_VALUE;

          int left = 0;
          int right = N - 1;

        // Calculate the possible length of
        // the sorted subarray from left
          while (left < right && arr[left + 1] >= arr[left]) 
          {
            left++;
          }
  
        // Array is sorted
          if (left == N - 1)
            return 0;

        // Calculate the possible length of
        // the sorted subarray from left
          while (right > left && arr[right - 1] <= arr[right]) 
          {
            right--;
          }

        // Update the result
          minlength = Math.min(N - left - 1, right);

          // Calculate the possible length
          // in the middle we can delete
          // and update the result
          int j = right;

          for (int i = 0; i < left + 1; i++) 
          {
            if (arr[i] <= arr[j]) 
            {
              // Update the result
              minlength = Math.min(minlength, j - i - 1);
            }
            else if (j < N - 1) 
            {
              j++;
            }
            else 
            {
              break;
            }
          }

          // Return the result
          return minlength;
        
        
        
    }
}
