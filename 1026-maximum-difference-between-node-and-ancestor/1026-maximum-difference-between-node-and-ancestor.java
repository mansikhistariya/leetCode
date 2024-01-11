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
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);
    }

    private int helper(TreeNode node, int min, int max) {
        if (node == null) {
            return max - min;
        }

        // Update min and max values
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);

        // Recursively calculate the maximum difference in the left and right subtrees
        int leftDiff = helper(node.left, min, max);
        int rightDiff = helper(node.right, min, max);

        // Return the maximum difference among the current node, left subtree, and right subtree
        return Math.max(leftDiff, rightDiff);
    }
}
