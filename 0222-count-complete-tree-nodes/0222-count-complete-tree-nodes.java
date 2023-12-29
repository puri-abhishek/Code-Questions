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
/* class Solution {
    int count = 0;
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        
        count++;
        countNodes(root.left);
        countNodes(root.right);
        
        return count;
        
    }
}
*/
class Solution {
    public int countNodes(TreeNode root) {
        int ans=0;
        if(root==null)
            return 0;
        if(root.right!=null)
        {
            int rnodes=countNodes(root.right);
            ans+=rnodes;
        }
        if(root.left!=null)
        {
            int lnodes=countNodes(root.left);
            ans+=lnodes;
        }
        return ans+1;
    }
}