//Leetcode 5
class Solution {
    public String longestPalindrome(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }
        
        String LPS = "";

        for (int i = 0; i < s.length(); i++) {

        
            String odd = expandAroundCenter(s, i, i);

            String even = expandAroundCenter(s, i, i + 1);

            String longer = odd.length() > even.length() ? odd : even;
            
            if (longer.length() > LPS.length()) {
                LPS = longer;
            }
        }

        return LPS;
    }

    private String expandAroundCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
