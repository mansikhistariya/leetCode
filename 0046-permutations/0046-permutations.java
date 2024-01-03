class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> result=new ArrayList<>();//all permutation
        backtrack(result,new ArrayList<>(),nums);
        return result;   //empty list
    }
    public void backtrack(List<List<Integer>> result,ArrayList<Integer> tempList, int[] nums){
        
        if(tempList.size()==nums.length){
            result.add(new ArrayList(tempList));
            return;
        }
        for(int i:nums){
            //skip same number
            if(tempList.contains(i)){
                continue;
            }
            tempList.add(i);
            backtrack(result,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
     
}