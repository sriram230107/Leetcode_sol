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

    public boolean issymm( TreeNode l,TreeNode r)
    {
        if(l==null && r==null)
        {
            return true;
        }
        if(l==null || r==null)
        {
            return false;
        }
        if(l.val==r.val)
        {
            if(issymm(l.left ,r.right) && issymm(l.right,r.left))
            {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        return issymm(root.left,root.right);
       
        
    }
}