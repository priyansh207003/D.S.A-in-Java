//leetcode 700
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
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        search(root,val);
        return ans;
    }
    public void search (TreeNode root ,int val){
        if(root==null)return ;
        if(root.val == val){
            ans = root;
        }
        if(root.val > val){
            search(root.left,val);
        }
        else{
            search(root.right,val);
        }
        return;
    }
}
