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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;

        return helper(root,targetSum,0);
    }
    int sum=0;
    public boolean helper(TreeNode root, int targetSum,int sum)
    {   

        if (root!=null) sum+=root.val;
        else    return false;
        if(root.left==null && root.right==null)
        {
            if(sum==targetSum)
                return true;
            else
                return false;   
        }
   

        return helper(root.left,targetSum,sum) || helper(root.right,targetSum,sum);
    }
}