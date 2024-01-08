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
    public TreeNode sortedArrayToBST(int[] nums) {
        int low=0;
        int high=nums.length;
        if(nums.length==0){
            return null;
        }
        return createtree(nums,0,nums.length-1);
    }
        public TreeNode createtree(int[]nums,int low,int high){
            if(low>high){
                return null;
            }
            int mid=(low+high)/2;
            TreeNode node=new TreeNode(nums[mid]);
            node.left=createtree(nums, low,mid-1);
             node.right=createtree(nums,mid+1,high);


           return node;
        
        }
        
} 
        
    
