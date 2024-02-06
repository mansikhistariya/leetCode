class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> re = new HashMap<>();
        for (String i : strs) {
            char[] arr = i.toCharArray();
            Arrays.sort(arr);
            String sort= new String(arr);
            re.computeIfAbsent(sort, k-> new ArrayList<>()).add(i);
        }
        return new ArrayList<>(re.values());
    }
}
