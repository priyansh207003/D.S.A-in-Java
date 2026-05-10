class Solution {
    public int reverse(int x) {
        int prev = 0;
        while(x!=0){
            int digit = x%10;
            if(prev>Integer.MAX_VALUE/10 || prev<Integer.MIN_VALUE/10){
                return 0;
            }
            prev = (prev*10)+digit;
            x=x/10;
        }
        return prev;
    }
}
