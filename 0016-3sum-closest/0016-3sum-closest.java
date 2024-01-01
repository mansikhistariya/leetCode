class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int resultsum=nums[0]+nums[1]+nums[2];//-6
        int mindi=Integer.MAX_VALUE;//9999..
        
       
       for(int i=0;i<nums.length-2;i++){
           int left=i+1;
           int right=nums.length-1;
           while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
               
              if(sum==target) {
                  return target;
                   
               }
               if(sum<target){
                    left++;

               }else{
                     right--;

               }
               int di=Math.abs(sum-target);
               if(di<mindi){
                   resultsum=sum;
                   mindi=di;
               }
                  
               
           }
       }
       return resultsum;
    }
}