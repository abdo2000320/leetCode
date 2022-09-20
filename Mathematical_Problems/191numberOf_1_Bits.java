public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0 ;
        //in java all Integer numbers are signed and reprented in 32 bit
        //negative number are represented in their 2 complement
        while(n != 0){
            count += n & 1;
            //why >>> not >> because the last depend either n is signed or not
            n = n>>>1;
        }
        return count;
    }
}
