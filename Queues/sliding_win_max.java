//Leetcode 239
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int [n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&& nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        for(int i=k;i<n;i++){
            res[idx++] = nums[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        res[idx]=nums[dq.peekFirst()];
        return res;
    }
}
