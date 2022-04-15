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
    public List<Integer> postorderTraversal(TreeNode root) {
        /*Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        
        List<Integer> postOrder = new ArrayList<>();
        
        st1.push(root);
        
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        
        while(!st2.isEmpty()){
            postOrder.add(st2.pop().val);
        }
        
        return postOrder;*/
        
        Stack<TreeNode> st1 = new Stack<TreeNode>(); 
        List<Integer> postOrder = new ArrayList<Integer>();
        
        if(root == null) return postOrder; 
        
        TreeNode current = root;  
        while(current != null || !st1.isEmpty()) {
            if(current != null){
                st1.push(current);
                current = current.left;
            }else{
                TreeNode temp = st1.peek().right;
                if (temp == null) {
                    temp = st1.pop();
                    postOrder.add(temp.val);
                    while (!st1.isEmpty() && temp == st1.peek().right) {
                        temp = st1.pop();
                        postOrder.add(temp.val);
                    }
                } else {
                    current = temp;
                }
            }
        }
      
        return postOrder; 
    }
}