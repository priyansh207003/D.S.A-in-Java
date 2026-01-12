//This is the leetcode problem of 1004
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros_count = 0;
        int start = 0;
        int max_count = 0;
        for(int end= 0;end<nums.length;end++){
            if(nums[end]==0){
                zeros_count++;
            }
            while(zeros_count>k){
                if(nums[start]==0){
                    zeros_count--;
                }
                start++;
            }
            max_count = Math.max(max_count,end-start+1);
        }
        return max_count;
    }
}
