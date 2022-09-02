class Solution {
    public int largestRectangleArea(int[] heights) {
        //keep the histogram in increasing order
		Stack<Integer> s = new Stack<>();
        int n = heights.length;
		int max_area = 0;
		int top; //top of stack
		int area_with_top; 

		int i=0;
        while(i<n){
			if(s.empty() || heights[s.peek()] <= heights[i])
			   s.push(i++);

			else{
				top = s.peek();
				s.pop();

				area_with_top = heights[top]*(s.empty()? i : i-s.peek()-1);

				if(max_area < area_with_top)
				  max_area = area_with_top;

			}
		}
        
		while(!s.empty()){
			top = s.peek();
			s.pop();
			area_with_top = heights[top]*(s.empty()? i : i-s.peek()-1);

			if(max_area < area_with_top)
			  max_area = area_with_top;
		}
        
		return max_area;
    }
    
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length, m=matrix[0].length;
        int[][] heights = new int[n][m];
        int maxRect = 0 ;
        //loop troup each row of mtrix
        //and calculate the sum of certical cells
        
         
        for(int i=0; i<n ; i++){
            for(int j=0; j<m ;j++){
                if(i==0)
                     heights[i][j] = matrix[i][j] - '0';
                
                else if((matrix[i][j] - '0') != 0)
                     heights[i][j] +=  (matrix[i][j] - '0') + heights[i-1][j];
                else 
                     heights[i][j] = 0;
            }
            if(maxRect < largestRectangleArea(heights[i]))
                maxRect = largestRectangleArea(heights[i]);
        }
        
        return maxRect;
    }
}