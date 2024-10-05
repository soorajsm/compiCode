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
    List<List<Integer>>list=new ArrayList<>();
    Queue<TreeNode>q=new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return list;
        q.add(root);
        q.add(null);
        List<Integer>l1=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode ele=q.remove();
            if(ele==null)
            {
                list.add(l1);
                if(q.isEmpty())
                {    
                    break;
                }
                else
                {
                    l1=new ArrayList<>();
                    q.add(null);
                }   
            }
            else
            {
                l1.add(ele.val);
                if(ele.left!=null)  q.add(ele.left);
                if(ele.right!=null) q.add(ele.right);

            }
        }
        return list;
    }
}