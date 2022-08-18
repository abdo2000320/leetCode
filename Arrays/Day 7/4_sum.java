//Java two pointer solution
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length; j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                long t = (long)target - nums[i] - nums[j];
                int m = j+1, n = nums.length-1;
                while(m < n){
                    if(nums[m]+nums[n] == t){
                        Integer[] temp = {nums[i], nums[j], nums[m], nums[n]};
                        res.add(Arrays.asList(temp));
                        m++;
                        n--;
                        while(m < nums.length && nums[m] == nums[m-1]) m++;
                        while(n >= 0 && nums[n] == nums[n+1]) n--;
                    } else if(nums[m]+nums[n] < t){
                        m++;
                    } else n--;
                }
            }
        }
        return res;
    }
}

//Python solution for Ksum
class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        return self.nSum(nums, target, 4, 0)
        
    def nSum(self, nums, target, n, idx):
        res = []
        if (n < 2):
            return res
        elif (n == 2):
            lo, hi = idx, len(nums) - 1
            while lo < hi:
                left, right = nums[lo], nums[hi]
                if left + right == target:
                    res.append([left, right])
                    while lo < hi and nums[lo] == left: lo += 1
                    while lo < hi and nums[hi] == right: hi-=1
                elif left + right < target:
                    while lo < hi and nums[lo] == left: lo+=1
                elif left + right > target:
                    while lo < hi and nums[hi] == right: hi-=1
            return res
        else:
            i = idx
            while i < len(nums):
                ret = self.nSum(nums, target - nums[i], n-1, i+1)
                for li in ret:
                    li.insert(0, nums[i])
                    res.append(li)
                while i+1 < len(nums) and nums[i] == nums[i+1]: i+=1
                i+=1
            return res
    




