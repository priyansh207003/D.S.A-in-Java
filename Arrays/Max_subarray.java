//This is the question of leetcode 53
class Solution {
    public int maxSubArray(int[] nums) {

        int bestend = nums[0];
        int ans  = nums[0];

        for(int i=1;i<nums.length;i++){
            int v1 = bestend+nums[i];
            int v2 = nums[i];
            bestend = Math.max(v1,v2);
            ans = Math.max (ans,bestend);
        }

        return ans;
        
    }
}
