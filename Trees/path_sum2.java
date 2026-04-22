/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        fill(root, 0, temp, targetSum);
        return res;
    }

    public void fill(TreeNode root, int sum, List<Integer> temp, int targetsum) {
        if (root == null) return;

        sum += root.val;
        temp.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum == targetsum) {
                res.add(new ArrayList<>(temp)); 
            }
        } else {
            fill(root.left, sum, temp, targetsum);
            fill(root.right, sum, temp, targetsum);
        }

        temp.remove(temp.size() - 1);
    }
}
