/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int leftHeight = leftcounter(root);
        int rightHeight = rightcounter(root);
        
        if(leftHeight == rightHeight) {
            return (1 << leftHeight) - 1; //left is the height
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
         
    }
    
    public int leftcounter(TreeNode root){
        if(root == null) {
            return 0;
        } else {
            return 1 + leftcounter(root.left);
        }
    }
    
    
    public int rightcounter(TreeNode root){
        if(root == null) {
            return 0;
        } else {
            return 1 + rightcounter(root.right);
        }
    }
}