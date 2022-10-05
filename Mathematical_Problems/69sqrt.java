class Solution {
    public int mySqrt(int x) {
        long sqrtroot = x;
        while(sqrtroot * sqrtroot > x){
            sqrtroot = (sqrtroot + x/sqrtroot)/2;
        } 
        return (int)sqrtroot;
    }
}
