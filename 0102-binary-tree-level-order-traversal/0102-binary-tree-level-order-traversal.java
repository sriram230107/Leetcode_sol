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
                l2.add(tr.peek().val);
                if(tr.peek().left!=null)
                {
                    tr.add(tr.peek().left);
                }
                if(tr.peek().right!=null)
                {
                    tr.add(tr.peek().right);
                }
                tr.remove();
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