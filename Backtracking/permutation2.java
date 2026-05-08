//Leetcode 47
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<>(),nums,new boolean[nums.length]);
        return result;
    }
    private void backtrack(List<List<Integer>>result, ArrayList<Integer>temp,int nums[],boolean []used){
        if(temp.size()==nums.length && !result.contains(temp)){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //Skip if we get same element
            if(used[i])continue;
            //Add the new element and mark as used
            used[i]=true;
            temp.add(nums[i]);
            //Go back and try next element
            backtrack(result,temp,nums,used);
            // Remove the element mark it as unused;

            used[i]=false;
            temp.remove(temp.size()-1);
        }

    }
}
