class Solution {
     public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
    private void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color ) return;
        
        image[sr][sc] = newColor;
         
        int[] rowNbr = new int[]{1,0,-1,0};
        int[] colNbr = new int[]{0,1,0,-1};
        
        for(int i=0; i<4 ; i++)
            fill(image, sr + rowNbr[i], sc + colNbr[i], color, newColor);
       
    }
    
       static int numOfSurroundedWater(int[][] matrix, int i , int j, int color){
       int m = matrix.length, n = matrix[0].length;
       int count = 0;
       
       if(i > 0 && matrix[i-1][j] == color) //bottom
           count++;
       if(i < m-1 && matrix[i+1][j] == color)//above
           count++;
       if(j > 0 && matrix[i][j-1] == color)//left
           count++;
       if(j < n-1 && matrix[i][j+1] == color)//right
           count++;
       
       return count;
   } 
    
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
         /**
         *1st determine the connected square in same component
         *2nd change the color of square in border
         *that's means each square adjacent of outside the componenet
         *or located in the border of the grid       
         */
         int  m = grid.length, n = grid[0].length;
         //create new matrix that's  a clone of grid 
         //to hold the new grid 
         //because when we change the value of square in same component
         //we change the real valueof  numOfSurroundedWater() output
         int[][] newGrid = new int[m][n];
         for(int i=0; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                newGrid[i][j] = grid[i][j];
        
         grid = floodFill(grid,row,col,0);
        
         for(int i=0; i<m ; i++)
             for(int j=0 ; j<n ; j++)
                 if(grid[i][j] == 0 && numOfSurroundedWater(grid,i,j,0) <  4)
                     newGrid[i][j] =  color;
        
        return newGrid;
                     
    }
}
