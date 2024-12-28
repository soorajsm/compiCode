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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        max=Math.max(height(root.left)+height(root.right),max);
        if(root.left!=null)  diameterOfBinaryTree(root.left);
        if(root.right!=null)  diameterOfBinaryTree(root.right);
        return max;
    }

    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        return Math.max(height(root.left),height(root.right))+1;
    }
}