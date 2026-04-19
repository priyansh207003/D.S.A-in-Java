//leetcode 1123
class Solution {
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).node;
    }

    class Pair {
        TreeNode node;
        int depth;
        
        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public Pair dfs(TreeNode root) {
        if (root == null) {
            return new Pair(null, 0);
        }

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        if (left.depth > right.depth) {
            return new Pair(left.node, left.depth + 1);
        } 
        else if (right.depth > left.depth) {
            return new Pair(right.node, right.depth + 1);
        } 
        else {
            return new Pair(root, left.depth + 1);
        }
    }
}
