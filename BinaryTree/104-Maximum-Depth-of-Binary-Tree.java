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
    int Maxdepth=Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;

        helper(root,1);
        return Maxdepth;

    }

    public void helper(TreeNode root,int depth)
    {
        if(root.left!=null) helper(root.left,depth+1);
        if(root.right!=null) helper(root.right,depth+1);
        Maxdepth=Math.max(depth,Maxdepth);
    }
}