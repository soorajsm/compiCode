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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root!=null)
            helper(root,0,list);
        return list;
    }

    public void helper(TreeNode root,int level,List<List<Integer>>  list)
    {
        if(level>list.size()-1)
            list.add(new ArrayList<>());

        list.get(level).add(root.val);

        if(root.left!=null) helper(root.left,level+1,list);
        if(root.right!=null) helper(root.right,level+1,list); 
    }
}






























// Using queue

// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         if(root==null)
//             return new ArrayList<>();
//         Queue<TreeNode>q=new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         List<List<Integer>> list=new ArrayList<>();
//         List<Integer> l=new ArrayList<>();

//         while(!q.isEmpty())
//         {
//             TreeNode ele=q.poll();
//             if(ele==null)
//             {
//                 if(q.isEmpty())
//                 {
//                     list.add(l);
//                     return list;
//                 }
//                 else
//                 {
//                     list.add(l);
//                     q.add(null);
//                     l=new ArrayList<>();
//                 }
//             }
//             else
//             {
//                 l.add(ele.val);
//                 if(ele.left!=null) q.add(ele.left);
//                 if(ele.right!=null) q.add(ele.right);
//             }

//         }                                                                                                                   return list;                
//     }
// }