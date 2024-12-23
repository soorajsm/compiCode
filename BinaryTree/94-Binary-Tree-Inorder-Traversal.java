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
    public List<Integer> inorderTraversal(TreeNode root) {
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
            else
            {
                s.pop();
                list.add(node.val);
                if(node.right!=null)
                {
                    s.push(node.right);
                    node.right=null;
                }
            }
        }
        return list;
    }
}

















// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer>list=new ArrayList<>();
//         helper(root,list);
//         return list;
//     }

//     public void helper(TreeNode root,List<Integer>list)
//     {
//         if(root!=null)
//         {
//             helper(root.left,list);
//             list.add(root.val);
//             helper(root.right,list);
//         }
//         return;
//     }
// }