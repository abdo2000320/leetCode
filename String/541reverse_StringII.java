class Solution {
    public String reverseStr(String s, int k) {
       char[] arrChars = s.toCharArray();
       int p1 , p2 ;
        
       if(arrChars.length <= k){
           p1 = 0 ; p2 = arrChars.length-1;
           swap(arrChars, p1, p2);
       }
       else if(arrChars.length > k && arrChars.length < 2*k){
           p1 = 0 ;  p2 = k - 1;
          swap(arrChars, p1, p2);
       }
       else {
         for(int i=0; i < arrChars.length ; i = i+ 2*k){
            p1 = i;
            if(i+k < arrChars.length)
             { 
                p2 = i + k - 1;
             }else
                p2 = arrChars.length-1;
            
             swap(arrChars, p1, p2);
           }
       }
        return String.valueOf(arrChars);
        
    }
    
      private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
