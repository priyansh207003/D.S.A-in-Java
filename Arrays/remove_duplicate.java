public class Remove_duplicate {
  //This is the question of leetcode 26
  // step1) Initialize two pointers cm and off to 1 and 0 respectively
  // step2) While cm is less than the length of the array
  // step2.1) If the current element is equal to the previous element
  //     step2.1.1) Increment cm
  // step2.2) Else
  //     step2.2.1) Assign the current element to the position off+1
  //     step2.2.2) Increment cm and off
  //     step2.2.3) Increment the result counter res
  // step3) Return res as the length of the array with duplicates removed

  public static int remove(int nums[]){
    int cm=1;
    int res=1;
    int off=0;
    while(cm < nums.length){
      if(nums[cm]==nums[cm-1]){
        cm++;
        continue;
      }
      else{
        nums[off+1]=nums[cm];
        cm++;
        off++;
        res++;
      }
    }
    return res++;
  }
  public static void main(String argc[]){
    int nums[]={1,1,2,2,2,3,3,4,4};
    remove(nums);
    for (int num : nums) {
      System.out.print(num);
      
    }
  }
  
}
