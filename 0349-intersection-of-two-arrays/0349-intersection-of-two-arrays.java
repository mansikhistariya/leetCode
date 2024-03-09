class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=Math.min(nums1.length,nums2.length);
        HashSet<Integer> re=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int i:nums1){
            re.add(i);
        }
        
        for(int i:nums2){
            if(re.contains(i)){
                ans.add(i);
            }
        }
        int[] arr=new int[ans.size()];
        int i=0;
        for(int j:ans){
            arr[i]=j;
            i++;
        }
        return arr;
    }
}