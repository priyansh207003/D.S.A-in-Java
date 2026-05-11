class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
       int[] larger = nums1.length <= nums2.length ? nums2 : nums1;
        int total = nums1.length+nums2.length;
        int low = 0;
        int high = smaller.length;
        while(low<=high){
            int partitionx = (low+high)/2;
            int partitiony = (total+1)/2-partitionx;

            int l1 = partitionx==0?Integer.MIN_VALUE:smaller[partitionx-1];
            int r1 = partitionx==smaller.length?Integer.MAX_VALUE:smaller[partitionx];

            int l2 = partitiony==0?Integer.MIN_VALUE:larger[partitiony-1];
            int r2 = partitiony==larger.length?Integer.MAX_VALUE:larger[partitiony];

            if(l1<=r2 && l2<=r1){
                if((total)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else{
                    return Math.max(l1,l2);
                }

            }
            if(l1>r2)high = partitionx-1;
            else low = partitionx+1;
        }
        return 0;
    }
}
