class Solution {
    public int totalFruit(int[] fruits) {

        // Step 1: Create a map to store fruit type and its count in the current window
        Map<Integer, Integer> basket = new HashMap<>();

        // Step 2: Initialize left pointer of sliding window
        int left = 0;

        // Step 3: Variable to store maximum number of fruits collected
        int maxfruits = 0;

        // Step 4: Expand the sliding window using right pointer
        for (int right = 0; right < fruits.length; right++) {

            // Step 5: Add current fruit to the basket or increase its count
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // Step 6: If basket has more than 2 fruit types, shrink the window
            while (basket.size() > 2) {

                // Step 7: Get the count of the fruit at the left pointer
                int fruitscount = basket.get(fruits[left]);

                // Step 8: If count becomes 1, remove that fruit type from basket
                if (fruitscount == 1) {
                    basket.remove(fruits[left]);
                }
                // Step 9: Otherwise, just decrease its count
                else {
                    basket.put(fruits[left], fruitscount - 1);
                }

                // Step 10: Move left pointer to shrink the window
                left++;
            }

            // Step 11: Update the maximum fruits collected
            maxfruits = Math.max(maxfruits, right - left + 1);
        }

        // Step 12: Return the maximum fruits collected
        return maxfruits;
    }
}
