//Leetcode 242
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer>have = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            have.put(ch,have.getOrDefault(ch,0)+1);
        }

         for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }

        if(have.equals(need)){
            return true;
        }
        return false;

    }
}
