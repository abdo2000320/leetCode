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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        HashMap<TreeNode,Boolean> visited = new HashMap<TreeNode,Boolean>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode current = stack.pop(); 
            if(!visited.getOrDefault(current,false)){
                visited.put(current,true); 
                result.add(current.val);
                 if(current.right != null) stack.push(current.right);
                if(current.left != null)  stack.push(current.left);
                
          
            }
             
        }
        return result;
    }
}
