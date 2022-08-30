import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        //read test cases
        int T = Integer.parseInt(br.readLine().trim());
        //for each test case read :N,M,A,B,Q,queries
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            int M = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            String[] arr_B = br.readLine().split(" ");
            int[] B = new int[M];
            for(int i_B = 0; i_B < arr_B.length; i_B++)
            {
            	B[i_B] = Integer.parseInt(arr_B[i_B]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            int[][] queries = new int[Q][3];
            for(int i_queries = 0; i_queries < Q; i_queries++)
            {
            	String[] arr_queries = br.readLine().split(" ");
            	for(int j_queries = 0; j_queries < arr_queries.length; j_queries++)
            	{
            		queries[i_queries][j_queries] = Integer.parseInt(arr_queries[j_queries]);
            	}
            }

            int[] out_ = array_queries(N, M, A, B, Q, queries);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            
            System.out.println();
            
         }

         wr.close();
         br.close();
    }
    static int[] array_queries(int N, int M, int[] A, int[] B, int Q, int[][] queries){
        // Write your code here
        int[] result = new int[Q+1];
        result[0] = F(A,B);
        for(int i=0;i<Q;i++){
                int tmp;
                switch(queries[i][0]) {
                case 1 :
                    tmp = A[queries[i][1]];
                    A[queries[i][1]] =  B[queries[i][2]];
                    B[queries[i][2]] = tmp;
                    result[i+1] = F(N,M,A,B);
                    break;
                case 2 :
                    tmp = A[queries[i][1]];
                    A[queries[i][1]] =  A[queries[i][2]];
                    A[queries[i][2]] = tmp;
                    result[i+1] = F(N,M,A,B);
                    break;
                case 3 :
                    tmp = B[queries[i][1]];
                    B[queries[i][1]] =  B[queries[i][2]];
                    B[queries[i][2]] = tmp;
                    result[i+1] = F(N,M,A,B);
                    break;
                    
                }
 
             
        }


        return result;
    
    }
    int F(int N, int M,int[] A,int[] B){
        int som=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                som += A[i]*B[j]*(i+j);
            }
        }
        return som % 998244353;
    }
}