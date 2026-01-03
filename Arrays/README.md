public class rotate {
  //This is the question of leetcode 189 
  
  // step 1) reverse the whole array
  // step 2) reverse the first k elements
  // step 3) reverse the remaining n-k elements
  public static void rotate(int nums[],int k){
     int len =nums.length;
     k=k%len;
     rotatenum(nums, 0, len-1);
     rotatenum(nums, 0, k-1);
     rotatenum(nums, k, len-1);
  }
  public static void rotatenum(int nums[],int start,int end){
    while(start<end){
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp; 
      start++;
      end--;
    }
  }
  public static void main(String argc[]){
    int nums[]={1,2,3,4,5,6,7};
    int k = 4;
    rotate(nums, k);
    for (int num : nums) {
      System.out.print(num+" ");
    }

  }
  
}
