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
        List<Integer> re=new ArrayList<>();
        helper(root,re);
        return re;
    }
    private void helper(TreeNode root, List<Integer> re){
        if(root==null){
            return;
        }
        helper(root.left,re);
        helper(root.right,re);
        re.add(root.val);
    }
}