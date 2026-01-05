class Solution {
    public boolean isPalindrome(int x) {
      //Step 1) convert int to string
        String str = String.valueOf(x);
        int left =0;
        int right = str.length()-1;
      //step 2) Then Process continue using two Pointer Aproach
        while(left < right){
    if(str.charAt(left) != str.charAt(right)){
        return false;
      }
       left++;
       right--;
      }
       return true;

    }
}
