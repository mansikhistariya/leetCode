class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int[] a1=new int[nums.length/2];
        int[] a2=new int[nums.length/2];
       
       int k=0;
       int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                a1[k++]=nums[i];
               
            }

            else{
                a2[j]=nums[i];
                j++;
                
            }
        }
        int w=0;
        j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0 || i==0){
                ans[i]=a1[j];
                j++;
            }else{
                ans[i]=a2[w];
                w++;
                
            }

        }
        return ans;
    }
}