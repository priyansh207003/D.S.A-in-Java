//Leetcode 383
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Step 1: Count frequency of characters in magazine
        HashMap<Character, Integer> have = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            // If character not available or count is 0 → return false
            if (have.getOrDefault(ch, 0) == 0) {
                return false;
            }

            // Use one occurrence
            have.put(ch, have.get(ch) - 1);
        }

        return true;
    }
}
