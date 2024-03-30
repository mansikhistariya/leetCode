class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atm(nums,k)-atm(nums,k-1);
    }
    private int atm(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                while(map.size()>k){
                    if(map.get(nums[start])>1){
                        map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                    }else{
                        map.remove(nums[start]);
                    }
                    start++;
                }
                ans+=(i-start+1);
                
            }
        
        return ans;
        
    }
}