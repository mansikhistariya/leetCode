class Solution {
    public boolean isValid(String s) {
        Stack<Character> k=new Stack<>();
        char[] s1=s.toCharArray();
        for(int i:s1){
            if(i=='('){
                k.push(')');
            }
           else if(i=='{'){
                k.push('}');
            }
             else if(i=='['){
                k.push(']');
            }
            else if(k.isEmpty()||k.pop()!=i){
                return false;
            }
            
            
        }
        return k.isEmpty();
        
    }
}