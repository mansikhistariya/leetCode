

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string for an empty array
        } 
        if (strs.length == 1) {
            return strs[0]; // Return the only string in the array
        }

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return commonPrefix.toString(); // Return the common prefix found so far
                }
            }

            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }
}
