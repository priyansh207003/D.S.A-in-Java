public class firstandlastpos {
  public static int [] searchrange(int nums[],int target){
    int ans[] = {-1,-1};
    int start = search(nums,target,true);
    int end = search(nums,target,false);
    ans[0]=start;
    ans[1]=end;
    return ans;
  }
  public static int search(int nums[],int target,boolean find){
    int start=0;
    int end = nums.length-1;
    int ans =-1;
    while(start<=end){
      int mid = start+(end-start)/2;
      if(target<nums[mid]){
        end=mid-1;
      }
      else if(target>nums[mid]){
        start = start+1;
      }
      else{
        ans = mid;
        if(find){
          end=mid-1;
        }
        else{
          start=mid+1;
        }
      }
    }
    return ans;
  }
}
