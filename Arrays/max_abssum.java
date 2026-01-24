//This is the question number 1749 in leetcode
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxend = 0;
        int maxsum = 0;
        int minend = 0;
        int minsum = 0;
        for(int x:nums){
            maxend = Math.max(x,maxend+x);
            maxsum = Math.max(maxsum,maxend);

            minend = Math.min(x,minend+x);
            minsum = Math.min(minsum,minend);

        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}
