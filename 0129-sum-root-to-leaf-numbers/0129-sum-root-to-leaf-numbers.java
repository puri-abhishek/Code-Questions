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
    int res = 0;
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        adder(root, sum);
        return res;
    }
    
    public void adder(TreeNode root, int sum){
        if(root == null)
            return;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null)
            res += sum;
        adder(root.left, sum);
        adder(root.right, sum);
    }
}