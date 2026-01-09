class Solution {
    // Function to find maximum number of vowels in any substring of size k
    public static int maxVowels(String s, int k) {

        // Edge case: if string length is smaller than k
        if (s.length() < k) {
            return -1;
        }

        int curr_count = 0;

        // Step 1: Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                curr_count++;
            }
        }

        // Initialize max with first window count
        int max_count = curr_count;

        // Step 2: Slide the window
        for (int i = k; i < s.length(); i++) {

            // Character entering the window
            char in = s.charAt(i);
            if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u') {
                curr_count++;
            }

            // Character leaving the window
            char out = s.charAt(i - k);
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
                curr_count--;
            }

            // Update maximum vowels
            max_count = Math.max(max_count, curr_count);
          
        }

        return max_count;
    }

   
}
