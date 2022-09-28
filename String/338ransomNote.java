class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arrChars1 = ransomNote.toCharArray();
        char[] arrChars2 = magazine.toCharArray();
        for(int i=0; i<arrChars1.length; i++){
            boolean flage = false;
            for(int j=0 ; j<arrChars2.length; j++){
                if(arrChars1[i] == arrChars2[j]){
                    arrChars2[j] = '-';
                    flage = true;
                    break;
                }
            }
             if(!flage)
                    return false;
        }
        
        return true;
    }
}
