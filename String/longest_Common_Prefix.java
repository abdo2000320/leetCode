class Solution {
    public String longestCommonPrefix(String[] strs) {

        //brute force solution
  /*
        int n = strs.length; 
         if (strs == null || n == 0) return "";
        String commonPrefix = "";
        int count = 0;
        int m = Integer.MAX_VALUE , cnt=0;
        for(int i=0 ;i<n; i++){
            if(m > strs[i].length()){
                m = i;
                cnt++;
            }    
        }
        
        String smallestWord = strs[m];
        
        
        for(int j=0; j<smallestWord.length() ; j++){
           count = 1;
           for(int i=0; (i<n && i!=m ); i++){
               if(smallestWord.charAt(j) == strs[i].charAt(j)){
                    count++;
               } 
           }   
           if(count == n){
                commonPrefix += smallestWord.charAt(j);    
            }else{
               return String.valueOf(cnt);
           }
        }
        return commonPrefix;
       */
        
       
       if (strs == null || n == 0) return "";
       String res=strs[0];
        for(int i=0;i<strs.length;i++){
            //if res = "" we should exit
            if(res.isEmpty())
                break;
            while(strs[i].indexOf(res)!=0) //indexof() return 0 if found else -1
            { 
                 
                res=res.substring(0,res.length()-1);
                //substring() will chop 1 letter at last each time indexOf gives -1;
            }
        }
        return res;   
    }
}
