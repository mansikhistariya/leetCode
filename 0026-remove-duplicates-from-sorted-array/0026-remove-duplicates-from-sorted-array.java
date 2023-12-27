class Solution {
    public int removeDuplicates(int[] nums) {
        // 
        int j=1;
         
        for(int i=1;i<nums.length;i++){
            if(nums.length==0 || nums.length==1){
                return nums.length;
            }
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;

            }
            
            
            }
            return j;

        }
    }
    
  
