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
    public int sumEvenGrandparent(TreeNode root) {
        
        /* Check for every child and grandchild of an even valued node
        
        if(root == null) return 0;
        int sum = 0;
        if((root.val & 1) == 0){
            if(root.left != null && root.left.left != null) sum += root.left.left.val;
            if(root.left != null && root.left.right != null) sum += root.left.right.val;
            if(root.right != null && root.right.left != null) sum += root.right.left.val;
            if(root.right != null && root.right.right != null) sum += root.right.right.val;
        }
        
        return sum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
        
        */
        
        return helper(root, 1, 1);
    }
    
    // Approach 2 - using helper function to keep track of parent and grandparent of every node.
    public int helper(TreeNode node, int p, int gp) {
        if (node == null) return 0;
        return helper(node.left, node.val, p) + helper(node.right, node.val, p) + (gp % 2 == 0 ? node.val : 0);
    }
}