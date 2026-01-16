//This is the leetcode problem number 567
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Count frequency of characters in s1
        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;

        // Sliding window over s2
        for (int right = 0; right < s2.length(); right++) {
            char rChar = s2.charAt(right);
            freq[rChar - 'a']--;

            // If count goes negative, move left pointer
            while (freq[rChar - 'a'] < 0) {
                char lChar = s2.charAt(left);
                freq[lChar - 'a']++;
                left++;
            }

            // If window size matches s1 length → permutation found
            if (right - left + 1 == s1.length()) {
                return true;
            }
        }

        return false;
    }
}
