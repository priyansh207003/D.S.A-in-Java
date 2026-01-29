//Leetcode 560
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count=0;

        // prefix sum before starting

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum==k)count+=1;
            count+=map.getOrDefault(sum-k,0);
            map.merge(sum,1,Integer::sum);
        }
        return count;
        
    }
}
