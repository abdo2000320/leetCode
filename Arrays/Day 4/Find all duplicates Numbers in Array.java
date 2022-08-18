class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        int[] counter = new int[len+1];
       List<Integer> lst =new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            counter[nums[i]]++;
            if(counter[nums[i]]>1)
                lst.add(nums[i]);
        }
        
        return lst;
    }
}
