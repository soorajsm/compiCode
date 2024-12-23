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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)
            return list;
        Stack<TreeNode>s=new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode node=s.peek();
            if(node.left!=null)
            {
                s.push(node.left);
                node.left=null;
            }
            else if(node.right!=null)
            {
                s.push(node.right);
                node.right=null;
            }
            else
            {
                list.add(node.val);
                s.pop();
            }
        }
        return list;
    }
}














// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer>list=new ArrayList<>();
//         helper(root,list);
//         return list;
//     }
//     public void helper(TreeNode root,List<Integer> list)
//     {
//         if(root!=null)
//         {
//             helper(root.left,list);
//             helper(root.right,list);
//             list.add(root.val);
//         }
//     }
// }