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
    
    //Approach 1 : 
    /*public int deepestLeavesSum(TreeNode root) {
        
        //Simple : Perform Level order Traversal -> Add the values on last level of traversal and return the total
        Queue<TreeNode> q=new LinkedList<>();
        int sum=0;
        q.offer(root);
        while(!q.isEmpty()) {
            int size=q.size();
            sum=0;
            for(int i=0;i<size;i++) {
                TreeNode cur=q.poll();
                sum+=cur.val;
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
        }
        return sum;
    }*/
    
    private int maxLevel = 0;
    private int sum = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        calculateSumAtLevel(root,0);
        return sum;
        
    }
    
    private void calculateSumAtLevel(TreeNode root,int level){
        
       if(root == null) return;
        if(level > maxLevel){
            sum = 0;
            maxLevel = level;
        }
        if(level == maxLevel){
            sum = sum + root.val;
        }
        calculateSumAtLevel(root.left,level+1);
        calculateSumAtLevel(root.right,level+1);
    }
}