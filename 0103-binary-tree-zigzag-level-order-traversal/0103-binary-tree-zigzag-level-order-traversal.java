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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)
            return al;
        q.add(root);
        boolean reverse = false;
        
        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int size = q.size();
            
            for(int i = 0; i< size; i++){
                if(q.peek().left != null)
                    q.add(q.peek().left);
                if(q.peek().right != null)
                    q.add(q.peek().right);
                
                arr.add(q.remove().val);
            }
            if(reverse)
                Collections.reverse(arr);
            
            al.add(arr);
            reverse = !reverse;
        }
        return al;
    }
}