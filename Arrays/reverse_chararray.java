class Solution {
  //This is the problem of leetcode 344
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length;
        while(left<right){
            swap(s,left,right);
            left++;
            right--;
        }
    }
    public void swap(char[]s,int left , int right){
        int temp = s[left];
        s[left]=s[right];
        s[right] = temp;
    }
}
