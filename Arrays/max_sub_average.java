class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length<k){
            return-1;
        }
        double curr_sum = 0;
        for(int i=0;i<k;i++){
            curr_sum +=nums[i]; 
        }
        double max_sum = curr_sum;
        for(int i = k;i<nums.length;i++){
            curr_sum+=nums[i];
            curr_sum-=nums[i-k];
            max_sum = Math.max(curr_sum,max_sum);
        }
        return max_sum/k;
    }
}
