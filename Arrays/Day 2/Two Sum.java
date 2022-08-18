import java.util.HashMap;
import java.util.Map.Entry;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = nums.length, m1=0 , m2=0;
        for(int i=0;i<len;i++){
            if(map.containsValue(target-nums[i])){
                m1 = i;
                break;
            }else{
                map.put(i,nums[i]);
            }
        }
        for(Entry<Integer, Integer> entry: map.entrySet()) {
             if(entry.getValue() == target-nums[m1]) {
                m2 = entry.getKey();
                break;
              }
         }
        
        return new int[]{m2,m1};
        
    }
}
