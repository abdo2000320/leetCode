class Solution {
    private String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^A-Za-z0-9]", "");
    }
    
    public boolean isPalindrome(String s) {
        if(s == null)
            return true;
        s = removeAllNonAlphaNumeric(s.toUpperCase());
        if(s == null)
            return true;
        int p1=0 ,p2 = s.length()-1;
        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2))
                return false;
            p1++; p2--;
        }
        
        return true;
        
    }
}
