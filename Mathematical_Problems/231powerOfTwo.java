class Solution {
    public boolean isPowerOfTwo(int n) {
        //Notice that if n is a power of 2 so its binary is 1000000...
        //and n-1 is 1111111... number of digits less than n by 1
        //so if calculate the and logic between n and n-1 we will have 0
       //And note also that n should not be negative because alwayse 2^x >= 1
        return n>0 && (n & n-1) == 0;
    }
}
