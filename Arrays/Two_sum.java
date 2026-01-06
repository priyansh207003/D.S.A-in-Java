import java.util.Arrays;

class Two_sum {
    public int[] twoSum(int[] nums, int target) {

        // value + original index
        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // sort by value
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i][0] + arr[j][0];

            if (sum == target) {
                return new int[]{arr[i][1], arr[j][1]};
            } 
            else if (sum < target) {
                i++;
            } 
            else {
                j--;
            }
        }

        return new int[]{-1, -1};
      }
    }
