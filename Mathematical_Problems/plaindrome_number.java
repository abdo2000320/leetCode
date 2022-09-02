class Solution {
    public boolean isPalindrome(int x) {
         if(x<0)
            return false;
        //reverse the number x
         int number = x , reverse = 0 , remainder;
         while( number != 0){
             remainder = number % 10;
             reverse = reverse*10+remainder;
             number = number / 10;
         }
          
        if(x==reverse)
            return true;
        else
            return false;
    }
}
