class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minposition=-1;
        int maxposition=-1;
        
        long ct2=-1;
        long ans=0;
       
        for(int i=0;i<nums.length;i++){
            if(minK>nums[i] || maxK<nums[i]){
                ct2=i;
            }
            if(nums[i]==minK){
                minposition=i;   
            }
            
            if(nums[i]==maxK){
                maxposition=i;
            }
            
             long smaller=Math.min(minposition,maxposition);
             long temp=smaller-ct2;
            ans+=(temp<=0)?0:temp;
            // if(temp<=0){
            //     ans+=0;
            // }else{
            //     ans+=temp+1;
            // }
        }
        
        return ans;
    }
}