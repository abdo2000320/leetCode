class Solution {
    static boolean isSafe(char[][] M, int row, int col, 
                          boolean[][] visited){
         return (row >= 0) && (row <M.length) && (col >= 0) 
                 && (col <M[0].length) && (M[row][col] == '1' && !visited[row][col]);
     } 
    
    static void DFS(char[][] M, int row, int col, boolean[][] visited)     {
        int rowNbr[] = new int[] { -1, 0, 1, 0 };
        int colNbr[] = new int[]{ 0,1,0,-1 };
        
        visited[row][col] = true;
        for(int k=0; k<4; k++)
            if(isSafe(M,row+rowNbr[k],col+colNbr[k],visited))
                DFS(M,row+rowNbr[k],col+colNbr[k],visited);
    }
        
        
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        
        
        for(int i=0 ; i<m; i++)
            for(int j=0; j<n; j++)
                if(grid[i][j] == '1' && !visited[i][j])
                {
                    DFS(grid,i,j,visited);
                    count++;
                }          
        return count;
    }
}