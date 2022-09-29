class Solution {
    public String reverseWords(String s) {
       String[] arr = s.trim().split(" +");
 
            int p1 = 0, p2 = arr.length-1;
            String  temp;
            while(p1 < p2){
                temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
              
                p1++; p2--;
            }
        //join methode tranform an Array or any Iterator sush as list
        //to String with specific join betwen elements
        return  String.join(" ",arr);
    }
}

