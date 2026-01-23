class Solution {
  //This is the leetcode question number 1186
  //Maximum subarray sum with one deletion
    public int maximumSum(int[] arr) {
       int prevnodel = arr[0];
       int prevdel = 0;
       int max = arr[0];

       for(int i=1;i<arr.length;i++){
        prevdel = Math.max(prevnodel,prevdel+arr[i]);
        prevnodel = Math.max(prevnodel+arr[i],arr[i]);
        int curr = Math.max(prevdel,prevnodel);
        max = Math.max(max,curr);
       }
       return max;
    }
}
