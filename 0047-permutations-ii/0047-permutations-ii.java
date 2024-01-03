class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result =new ArrayList<>(); 
        Arrays.sort(nums);
        backtrack( result, new ArrayList<>(),nums,new boolean[nums.length]);
        return new ArrayList(result);
    }
    public void backtrack(List<List<Integer>>       result,  ArrayList<Integer>tempList,int[] nums,boolean[] used){
        if(tempList.size()==nums.length &&!result.contains(tempList)){
            result.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            
            if(used[i]){
                continue;
            }
            used[i]=true;
            tempList.add(nums[i]);
           backtrack(result,tempList,nums,used);
           used[i]=false;
           tempList.remove(tempList.size()-1);
        }

    }
}