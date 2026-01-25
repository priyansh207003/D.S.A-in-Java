
//Maximum subarray in circular array leetcode 918
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxend = 0,maxsum = nums[0];
        int minend = 0,minsum = nums[0];

        for(int x:nums){
            //For simple case 1
            maxend = Math.max(x,maxend+x);
            maxsum = Math.max(maxsum, maxend);
            //For case 2 if array circular 
            minend = Math.min(x,minend+x);
            minsum = Math.min(minsum, minend);

            total+=x;
        }
        if(maxsum<0)return maxsum;
        return Math.max(maxsum,total-minsum);
    }
}
