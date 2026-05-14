class Solution {
    public int threeSumClosest(int[] arr, int target) {
         Arrays.sort(arr);
         int result = arr[0]+arr[1]+arr[2];
         int mid = Integer.MAX_VALUE;

         for(int i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;

            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==target) return target;
                if(sum<target) left++;
                else right--;

                int diff = Math.abs(sum-target);
                if(diff<mid){
                    result = sum;
                    mid = diff;
                }
            }
         }
         return result;
    }
}
