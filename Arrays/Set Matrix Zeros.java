import java.util.List;
//Set Matrix Zeros
class Solution {
    public void setZeroes(int[][] matrix) {
       int m = matrix.length , n=matrix[0].length;
       List<Pair<Integer, Integer>> Coords = new ArrayList<Pair<Integer, Integer>>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             if(matrix[i][j] == 0){
               Pair<Integer, Integer> val = new Pair<Integer, Integer>(i, j);
               Coords.add(val);
                }
                    
            }
        }
        for(Pair<Integer, Integer> entry : Coords)
        {
            int key = entry.getKey();
            int value = entry.getValue();
            for(int i=0;i<m;i++){
                matrix[i][value] = 0;
            }
            for(int i=0;i<n;i++){
                matrix[key][i] = 0;
            }
        }
        
    }
}
