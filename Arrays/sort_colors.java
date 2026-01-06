class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                swap(nums, mid, right);
                right--;
            }
        }
    }

    private void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
