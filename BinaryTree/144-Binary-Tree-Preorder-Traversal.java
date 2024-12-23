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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root!=null)
        {
            Stack<TreeNode> s=new Stack<>();
            s.push(root);
            while(!s.isEmpty())
            {
                TreeNode node=s.pop();
                list.add(node.val);
                if(node.right!=null) s.push(node.right);
                if(node.left!=null) s.push(node.left);
            }
        }
        return list;
    }
}





















// class Solution {
//     List<Integer>list=new ArrayList<>();
//     public List<Integer> preorderTraversal(TreeNode root) {
//         if(root!=null)
//         {
//             list.add(root.val);
//             preorderTraversal(root.left);
//             preorderTraversal(root.right);
//         }
//         return list;
//     }
// }