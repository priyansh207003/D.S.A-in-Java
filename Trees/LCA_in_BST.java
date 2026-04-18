/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root,p,q);
        return ans;
    }
    public void lca(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return ;
        
        if(p==root || q==root){
            ans = root;
        }
        if(root.val<p.val && root.val<q.val){
            lca(root.right,p,q);
        }
       else if(root.val>p.val && root.val>q.val){
            lca(root.left,p,q);
        }
        else {
            ans = root;
        }
        
    }
}
