class Solution {
    public int findMaxLength(int[] nums) {
        int n =nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum =0;
        int maxl = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0){
                sum -= 1;
            }else{
                sum += 1;
            }
            if (sum == 0) {
                maxl = i + 1;
            } else if (mp.containsKey(sum)) {
                maxl = Math.max(maxl, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return maxl;
    }
}