class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max = 0, diff = 0,min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
           if(prices[i] < min)
               min = prices[i];
            diff = prices[i] - min;
            if(diff > max)
                max = diff;
        }
      
        return max;
    }
}
