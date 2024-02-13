class Solution {
    public String firstPalindrome(String[] words) {
        String l="";
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse();
             String k=sb.toString();
            if(k.equals(words[i])){
                l= words[i];
                break;
            }
        
        }
        return l;
    }
}