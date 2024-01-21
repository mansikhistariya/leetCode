class Solution {
    public int rob(int[] nums) {
       if(nums.length<2){
           return nums[0];
       } 
       int[] b=new int[nums.length];
        b[0]=nums[0];
        b[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            b[i]=Math.max(b[i-2]+nums[i],b[i-1]);
        }
        return b[nums.length-1];
    }
}