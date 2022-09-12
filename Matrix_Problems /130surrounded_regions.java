class Solution {
    public char[][] floodFill(char[][] image, int sr, int sc, char newColor) {
        if (image[sr][sc] != '-') return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
    private void fill(char[][] image, int sr, int sc, char color, char newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) return;
        
        image[sr][sc] = newColor;
         
        int[] rowNbr = new int[]{1,0,-1,0};
        int[] colNbr = new int[]{0,1,0,-1};
        
        for(int i=0; i<4 ; i++)
            fill(image, sr + rowNbr[i], sc + colNbr[i], color, newColor);
       
    }
    
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        for(int i=0 ; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                if(board[i][j] == 'O')
                    board[i][j] = '-';
        
        for(int i=0; i<n ; i++)
            floodFill(board, 0, i, 'O'); 
        
        for(int i=0; i<n ; i++)
             floodFill(board, m-1, i, 'O'); 
                        
        for(int i=0; i<m ; i++)
             floodFill(board, i, 0, 'O'); 
        
        for(int i=0; i<m ; i++)
             floodFill(board, i, n-1, 'O'); 
        
         for(int i=0 ; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                if(board[i][j] == '-')
                    board[i][j] = 'X';
    
        
    }
}
