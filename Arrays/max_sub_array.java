//This is the question of geekforgeek
public class max_sub_array {
  public static int maxsubarray(int nums[],int k){
    int n = nums.length;
    if(n<k)return 0;
    int window_sum=0;
    int max_sum = Integer.MIN_VALUE;
    for(int i=0;i<k;i++){
      window_sum+=nums[i];
    }
    max_sum=window_sum;
    for(int i=k;i<n;i++){
      window_sum+=nums[i]-nums[i-k];
      max_sum = Math.max(max_sum, window_sum);
    }
    return max_sum;
  }
  public static void main(String argc[]){
    int nums[] = {100,200,300,400};
    int k = 2;
    System.out.println(maxsubarray(nums, k)); 
  }
  
}
