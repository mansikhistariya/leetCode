class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //important it is similar to 2sum array
        //fixed 1 value and take remaining array aaply 2 pointer first and last
        //apply hashset we get unique array
        //o(n)xn=O(n2)
        int n=nums.length;
        if(nums==null || n<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        //unique pair of sum
        for(int i=0;i<n-2;i++){
            int first=i+1;
            int last=n-1;
            while(first<last){
                int sum=nums[i]+nums[first]+nums[last];
                if(sum==0){
                    result.add( Arrays.asList(nums[i],nums[first],nums[last]));
                    first++;
                    last--;
                }else if(sum<0){
                    first++;
                }else{
                    last--;

                }
                
            }
        }
        return new ArrayList<>(result);
        
    }
}