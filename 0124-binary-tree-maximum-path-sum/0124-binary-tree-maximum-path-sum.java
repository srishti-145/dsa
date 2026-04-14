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
    int maxs;
    public int maxPathSum(TreeNode root) {
        maxs=Integer.MIN_VALUE;;
        helper(root);
        return maxs;
    }
    public int helper(TreeNode curr){
        if(curr==null){
            return 0;
        }
        int left=helper(curr.left);
        int right=helper(curr.right);

        left=Math.max(left,0);
        right=Math.max(right,0);        
        int sum=left+right+curr.val;
        maxs=Math.max(maxs,sum);

        return Math.max(left,right)+curr.val;
    }
}