import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from 2*n - 1 to 0 to simulate circular array
        for (int i = 2 * n - 1; i >= 0; i--) {

            // Remove elements smaller or equal to current
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }

            // Only fill result in first pass
            if (i < n) {
                if (stack.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = stack.peek();
                }
            }

            // Push current element
            stack.push(nums[i % n]);
        }

        return res;
    }
}
