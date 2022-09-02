import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter out=new PrintWriter(System.out);
        // Reading N from STDIN
       Integer N = Integer.parseInt(br.readLine());
       Queue<Integer> queue = new LinkedList<Integer>();
       int number ;
       String op = new String();
       for(int i=0 ; i<N ; i++){
           op = br.readLine();
          if(op.equals("D")){
              try{
                 number = queue.remove();
                 System.out.println(number+" "+queue.size());
              }catch(Exception e){
                  System.out.println("-1"+" "+queue.size());
              } 
          }
          else{
              if(queue.offer(Integer.parseInt((op.split(" ")[1]))))
               System.out.println(queue.size());
              else
               System.out.println("Enqueue Failled !!");
          }
       }
    }
}
