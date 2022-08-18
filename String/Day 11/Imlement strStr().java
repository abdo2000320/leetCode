//obvious solution
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        String str;
        if(m==0)
            return 0;
        
        for(int i =0; i<=n-m ; i++){
           str = haystack.substring(i,i+m);
           if(str.equals(needle))
               return i; 
        }
         
        return -1;
    }
}


//An othor good solution : (github : Anasslmloul)
class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length()>haystack.length()) {
            return -1;
        } 
        if(needle.length()==haystack.length()) {
            if(haystack.equals(needle)) {
                return 0;
            }
            return -1;
        }
        
        
        int i=0;
        int j=0;
        while(i<needle.length() && j<haystack.length()) {
            if(needle.charAt(i)==haystack.charAt(j)) {
                i++;
                j++;
                if(i==needle.length()) {
                    return j-needle.length();
                }
            } else {
                j = j-i+1; // backtrack to last pos+1 where there was a probable match
                i=0;
            }
        }
        
        return -1;
    }
} 
