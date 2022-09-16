import java.util.*;

class Solution {
    public static List<Integer> addToArrayForm(int[] num, int k) {
       int n = num.length;
       int carry = 0 ,sum;
       for(int i=n-1; i>=0 ; i--){
           if(i==n-1)
               sum = num[i] + k > 9 ?  (num[i] + k % 10) : num[i] + k;
           else
               sum = num[i] + carry > 9 ?  (num[i] + k % 10) : num[i] + k;
            
               num[i] = sum;  
               carry = (num[i] + carry) / 10;
       }
       if(carry != 0){
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
            list.add(0,carry);
            return list;
        }
        return new ArrayList<Integer>(Arrays.asList(num));
   }


   public static void main(String[] args[]){
      System.out.println(addToArrayForm(new int[]{1,2,3},1));
   }

}