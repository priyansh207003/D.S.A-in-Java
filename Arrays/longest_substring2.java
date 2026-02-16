//Leetcode 3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>charSet = new HashSet<>();
        int max_length=0;
        int left = 0;
        for(int right=0;right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            max_length = Math.max(max_length,right-left+1);
        }
        return max_length;
        
    }
}
