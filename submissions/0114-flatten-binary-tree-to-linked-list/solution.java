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
    public void flatten(TreeNode root) {
        if(root==null) {
            return ;
        }        
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.add(root);
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            if(temp.right!=null) s.add(temp.right);
            if(temp.left!=null) s.add(temp.left);

            if(!s.isEmpty() && temp!=null){
                temp.right=s.peek();
                temp.left=null;
            }
        }
    }
}
