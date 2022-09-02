import java.util.Stack;

class Solution {
   public int largestRectangleArea(int[] heights) {
	   //keep the histogram in increasing order
	   Stack<Integer> s = new Stack<>();
	   int n = heights.length;
	   int max_area = 0;
	   int top; //top of stack
	   int area_with_top; //before pop() a bar from stack calculate it area 

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
}