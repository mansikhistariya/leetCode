class Solution {
    public int evalRPN(String[] tokens) {
        int[] arr = new int[tokens.length];
        int i = 0;
        for(String s : tokens) {
            char c = s.charAt(0);
            if(c=='+') {
                int b = arr[--i];
                int a = arr[--i];
                arr[i++] = a+b;
            } else if(c=='-' && s.length()==1) {
                int b = arr[--i];
                int a = arr[--i];
                arr[i++] = a-b;
            } else if(c=='*') {
                int b = arr[--i];
                int a = arr[--i];
                arr[i++] = a*b;
            } else if(c=='/') {
                int b = arr[--i];
                int a = arr[--i];
                arr[i++] = a/b;
            } else 
                arr[i++] = Integer.parseInt(s);
        }
        return arr[0];
    }
}