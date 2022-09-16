/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //we will use binary search to look for the first bad version
        if(!isBadVersion(n))
            return -1;
        
        int low = 0, hight = n;
        while(low <= hight){
          int midium = low + (hight - low)/2;
          if(!isBadVersion(midium) && isBadVersion(midium+1))
              return midium+1;
            
          if(isBadVersion(midium))
             hight = midium - 1 ;
          else
             low = midium +1;
        }
        return n;
    }
}
