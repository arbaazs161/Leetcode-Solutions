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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                tempList.add(queue.poll().val);
            }
            ans.add(tempList);
        }
        return ans;
    }
}