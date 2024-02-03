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
    int maxlvl = 0;
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
         rightCheck(root, 1, al);
        return al;
    }
    void rightCheck(TreeNode root, int lvl, List<Integer> al){
        if(root==null)
        {
            return;
        }
        if(maxlvl < lvl)
        {
            al.add(root.val);
            maxlvl = lvl;
        }
        rightCheck(root.right, lvl+1, al);
        rightCheck(root.left, lvl+1, al);
        
    }
}
