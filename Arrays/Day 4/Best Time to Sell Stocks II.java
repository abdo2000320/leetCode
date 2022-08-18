class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max = 0, diff = 0,min = Integer.MAX_VALUE;
        for(int i=0;i<len-1;i++){
           if(prices[i] < prices[i+1])
            {
                 
                diff = prices[i+1] - prices[i];
                max += diff;
            }  
        }  
      
        return max;
    }
} 
