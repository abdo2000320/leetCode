/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0, hight = n;
        while(low <= hight){
            int midium = low + (hight - low)/2;
            if(guess(midium) == 0)
                return midium;
            else if(guess(midium) < 0)
                hight = midium -1;
            else 
                low = midium +1;
        }
        return -1;
    }
}
