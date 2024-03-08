
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int maxFrequency =Integer.MIN_VALUE;
        for (int f : map.values()) {
            maxFrequency = Math.max(maxFrequency, f);
        }
        
       
        for (int f : map.values()) {
            if (f == maxFrequency) {
                count+=maxFrequency;
            }
        }
        return count;
    }
}
