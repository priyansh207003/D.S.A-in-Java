class Solution {
    TreeNode ans = null;

    public int dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return 0;

        int left = dfs(root.left, p, q);
        int right = dfs(root.right, p, q);

        int self = (root == p || root == q) ? 1 : 0;

        int total = left + right + self;

        if (total >= 2 && ans == null) {
            ans = root;
        }

        return total;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }
}
