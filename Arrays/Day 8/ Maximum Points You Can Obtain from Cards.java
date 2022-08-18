    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            //Sliding windows method
            int n =  cardPoints.length;
            int max_sum = 0;
            if(k>n || n==0)
                return 0;

            for(int i=n-1; i>=n-k ;i--)
                  max_sum += cardPoints[i];

            int window_sum = max_sum;
            for(int i=0; i<k ; i++){
                window_sum += cardPoints[i] - cardPoints[n-k+i];
                max_sum = Math.max(max_sum, window_sum);
            }

            return max_sum;
        }
    }
