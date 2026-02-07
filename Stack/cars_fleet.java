import java.util.*;
//Leetcode 853
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        // Step 1: Create pairs (position, speed)
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Step 2: Sort cars by position descending (closest to target first)
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        // Step 3: Stack to store fleet times
        Stack<Double> stack = new Stack<>();

        // Step 4: Traverse cars
        for (int i = 0; i < n; i++) {

            int pos = cars[i][0];
            int spd = cars[i][1];

            // Time to reach target
            double time = (double)(target - pos) / spd;

            // If this car forms a new fleet
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // Else: it joins the fleet ahead (do nothing)
        }

        return stack.size();
    }
}
