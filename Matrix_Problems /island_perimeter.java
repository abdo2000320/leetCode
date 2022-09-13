class Solution {
   static int numOfSurroundedWater(int[][] matrix, int i , int j){
       int m = matrix.length, n = matrix[0].length;
       int count = 0;
       
       if(i > 0 && matrix[i-1][j] == 1) //bottom
           count++;
       if(i < m-1 && matrix[i+1][j] == 1)//above
           count++;
       if(j > 0 && matrix[i][j-1] == 1)//left
           count++;
       if(j < n-1 && matrix[i][j+1] == 1)//right
           count++;
       
       return count;
   } 
    
    
    public int islandPerimeter(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int perimeter = 0;
        for(int i=0 ; i<m ; i++) 
            for(int j=0; j<n ; j++) 
                if(grid[i][j] == 1)
                    perimeter += (4 - numOfSurroundedWater(grid,i,j));
            
        return perimeter;
    }
}
