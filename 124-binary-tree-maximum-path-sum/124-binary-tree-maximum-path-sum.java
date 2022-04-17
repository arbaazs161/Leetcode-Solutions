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
    public int maxPathSum(TreeNode root) {
        int[] diam = new int[1];
        diam[0] = Integer.MIN_VALUE;
        height(root, diam);
        return diam[0];
    }
    
    public int height(TreeNode root, int[] diam){
        if(root == null){
            return 0;
        }
        
        int lh = Math.max(0, height(root.left, diam));
        int rh = Math.max(0, height(root.right, diam));
        
        diam[0] = Math.max(diam[0], lh+rh + root.val);
        return root.val + Math.max(lh, rh);
    }
}