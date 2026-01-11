import java.util.HashMap;
import java.util.Map;

public class fruits_into_basket {
  public static int totalfruit(int[]nums){
    
    Map<Integer, Integer> freq = new HashMap<>();
    int left = 0;
    int maxcount = 0;
    for(int right=0;right<nums.length;right++){
       freq.put(nums[right], freq.getOrDefault(freq, 0)+1);
       while(freq.size()>2){
        freq.put(nums[left], freq.get(nums[left])-1);
        if(freq.get(nums[left])==0){
          freq.remove(nums[left]);
        }
        left++;
       }
       maxcount = Math.max(maxcount,right-left+1);
    }
    return maxcount;
  }
  public static void main(String argc[]){
    int nums[]={1,2,3,3,4,4};
    int result = totalfruit(nums);
    System.out.println(result);
  }
}
