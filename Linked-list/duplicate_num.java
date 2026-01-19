class Solution {
    public int findDuplicate(int[] nums) {
       int slow  = nums[0];
       int fast = nums[0];
      //Phase 1 check it is cyclic or not
       do{
        slow = nums[slow];
        fast = nums[nums[fast]];
       }while(slow!=fast);
      //Phase 2 return the start of the cycle 
       slow = nums[0];
       while(slow!=fast)
       {
        slow = nums[slow];
        fast = nums[fast];
       }
       return slow;
    }
}
