//Obvious Solution
class Solution {
    public int maxArea(int[] height) {
        int len = height.length , max = Integer.MIN_VALUE;
        Integer[][] tab = new Integer[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
             tab[i][j] = (j-i)*Math.min(height[j],height[i]);
             if(max < tab[i][j])
                 max = tab[i][j];
            }
        }
        
        return max;
         
    }
}

//Two pointer method
public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=height.length-1;
        
        while(start<end){
            int min=Math.min(height[start],height[end]); //we will find the min of both height because that is the water level
            max=Math.max(max,min*(end-start)); //finding the amount of water 
            if(height[satrt]<height[end]) start++; //if ith is smaller then increase i
            else end--; // if jth is smalller then decrease j
        }
        return max;   
    }
