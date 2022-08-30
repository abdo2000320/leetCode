 //obvious solution
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //Search for sum of 3 element that equal to 0
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                for(int k=0;k<len;k++){
                    if(nums[i]+nums[j]+nums[k] == 0 && i!=j && i!=k && j!=k && !res.contains(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]))) && !res.contains(new ArrayList<>(Arrays.asList(nums[j],nums[i],nums[k]))) && !res.contains(new ArrayList<>(Arrays.asList(nums[k],nums[j],nums[i]))) && !res.contains(new ArrayList<>(Arrays.asList(nums[i],nums[k],nums[j]))) && !res.contains(new ArrayList<>(Arrays.asList(nums[j],nums[k],nums[i]))) && !res.contains(new ArrayList<>(Arrays.asList(nums[k],nums[i],nums[j])))){
                        List<Integer> ls = new ArrayList<Integer>();
                        ls.add(nums[i]); 
                        ls.add(nums[j]);
                        ls.add(nums[k]);
                        res.add(ls);
                    }
                }
            }
        } 
       return res;    
}

//two pointers method
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      int len = nums.length;
      int start, end ;
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      //sort array
      Arrays.sort(nums); 
      //parse it (skip it for duplicates nbrs)
      for(int i=0;i<len;i++){
          start = i+1; end = len-1;
          if(i!=0 && nums[i] == nums[i-1])
                    continue;
          while(start < end){
             if(i+1!=start && nums[start] == nums[start-1])
                 start++;
             //if we find solution store it 
             else if(nums[i]+nums[start]+nums[end] == 0 ){
                 List<Integer> ls = new ArrayList<Integer>();
                 ls.add(nums[i]);
                 ls.add(nums[start]);
                 ls.add(nums[end]);
                 res.add(ls);
                 start++; end--;
              }else if(nums[i]+nums[start]+nums[end] > 0){
                 end--;
              }else{
                 start++;
              }
         }
      }                     
     
        return res;
               
    }
}       
