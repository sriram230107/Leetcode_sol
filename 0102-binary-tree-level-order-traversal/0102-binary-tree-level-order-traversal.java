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
    List <List<Integer>> l1=new ArrayList<>();
    public void lo(TreeNode root)
    {
        TreeNode str=root;
        Queue<TreeNode> tr=new LinkedList<>();
       
        
        
        if(str!=null)
        {
            tr.add(root);
        }
        while(!tr.isEmpty())
        {
            int LEN=tr.size();
            List<Integer> l2 = new ArrayList<>();
            while(LEN--!=0)
            {
                TreeNode tn=tr.poll();
                l2.add(tn.val);
                if(tn.left!=null)
                {
                    tr.add(tn.left);
                }
                if(tn.right!=null)
                {
                    tr.add(tn.right);
                }
            }
            l1.add(l2);
        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root==null)
        {
            return l1;
        }
        lo(root);
        return l1;
        
        
    }
}