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
    public int findSecondMinimumValue(TreeNode root) {
    if(root==null)  return -1;
    return findSecondMinValue(root, root.val);
}


public int findSecondMinValue(TreeNode root, int min) {
    if(root==null)  return -1;
    if(root.val>min)   return root.val;
    int leftMin = findSecondMinValue(root.left,min);
    int rightMin = findSecondMinValue(root.right,min);
    return (leftMin==-1 || rightMin==-1) ? Math.max(leftMin,rightMin) : Math.min(leftMin,rightMin);
}
}