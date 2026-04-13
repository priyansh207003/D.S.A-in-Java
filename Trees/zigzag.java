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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list  =  new ArrayList<>();
        if(root==null) return list ;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean leftToright = true;

        while(queue.size()>0){
            List<Integer> li = new ArrayList<>();
            int count = queue.size();
            for(int i=0;i<count;i++){
                TreeNode curr = queue.remove();
                if(leftToright){
                    li.add(curr.val);
                }
                else{
                    li.add(0,curr.val);
                }
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);

            }
            list.add(li);
            leftToright = !leftToright;

        }
        return list;
    }
}
