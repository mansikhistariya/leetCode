class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int k=-1;
        int mid=(0+nums.length-1)/2;
        for( int i=0;i<=mid;i++){
            int j=i+1;
            if(nums[i]==nums[j]){
                k=nums[j];
            }
        }
        for(int i=mid+1;i<nums.length-1;i++){
            int j=i+1;
            if(nums[i]==nums[j]){
                k=nums[j];
            }
        }
        
        return k;

    }
}