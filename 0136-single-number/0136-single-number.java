class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> oc = new HashMap<>();
        for (int num :nums) {
            oc.put(num, oc.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> i :oc.entrySet()) {
            if (i.getValue() == 1) {
                return i.getKey();
            }
        }
        return 0; 
    }
}
