class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
    private void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) return;
        
        image[sr][sc] = newColor;
         
        int[] rowNbr = new int[]{1,0,-1,0};
        int[] colNbr = new int[]{0,1,0,-1};
        
        for(int i=0; i<4 ; i++)
            fill(image, sr + rowNbr[i], sc + colNbr[i], color, newColor);
       
    }
}


