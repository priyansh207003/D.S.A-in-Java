class Solution {

//This is leetcode question find pivot index -724
    public int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;

        for (int x : nums) {
            sum += x;
        }

        for (int i = 0; i < nums.length; i++) {
            int right = sum - left - nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }
}
