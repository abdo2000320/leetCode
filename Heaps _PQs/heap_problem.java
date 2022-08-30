import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    static private void max_heapify(ArrayList<Integer> list, int i ){
        int N = list.size();
        int left = i*2, right = i*2+1 , largest = Integer.MIN_VALUE;
        int temp;
        if(left<N && list.get(i) < list.get(left))
          largest = left;
        else
          largest = i;
        if(right <N && list.get(right) > list.get(largest))
          largest = right;
        if(largest != i){
            temp = list.get(i);
            list.set(i,list.get(largest));
            list.set(largest,temp);
        }
    }

    static private void build_maxheap(ArrayList<Integer> list){
        int N = list.size();
        for(int i=N/2-1 ; i>=0 ; i--)
           max_heapify(list,i);
    } 
    static private void increaseVal(ArrayList<Integer> list,int val){
        int i = list.size()-1;
        int temp;
        if(val < list.get(i))
        {
            System.out.print("Erreur : Insertion d'une val < 0 "+val);
            return;
        }
        list.set(i,val);
        while( i >= 1 && list.get(i/2) < list.get(i))
        {
            temp = list.get(i);
            list.set(i,list.get(i/2));
            list.set(i/2,temp); 
            i = i/2;
        }
    }
    
    static private void insertValue(ArrayList<Integer> list,int val){
        list.add(-1);
        increaseVal(list,val);
    }   
    
    static private int getMax(ArrayList<Integer> list){
        return list.get(0);
    }
    public static void main(String args[]) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int N = Integer.parseInt(br.readLine());  
        String[] str = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0 ; i<N ;i++){
            list.add(Integer.parseInt(str[i]));
        }
        int k = Integer.parseInt(br.readLine());
        for(int i=0 ; i<k ; i++){
            str = br.readLine().split(" ");
            if(Integer.parseInt(str[0]) == 1){
                insertValue(list,Integer.parseInt(str[1]));
            }else if(Integer.parseInt(str[0]) == 2){
                build_maxheap(list);
                System.out.println(getMax(list));
            }

        }
    }
}
