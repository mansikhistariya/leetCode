
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> s1 = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                s1.push(i);
            } else if (sb.charAt(i) == ')' && !s1.isEmpty()) {
                s1.pop();
            } else if (sb.charAt(i) == ')') {
                sb.setCharAt(i, '*'); 
            }
        }
        
        while (!s1.isEmpty()) {
            sb.setCharAt(s1.pop(), '*'); 
        }
        
        
        sb = new StringBuilder(sb.toString().replaceAll("\\*", ""));
        
        return sb.toString();
    }
}
