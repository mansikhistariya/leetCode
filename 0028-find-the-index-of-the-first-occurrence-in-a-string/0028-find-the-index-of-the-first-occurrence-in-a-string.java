class Solution {
    public int strStr(String haystack, String needle) {
    
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j;
            for(  j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                } else{
                    continue;
                }

            }
            if(j==needle.length()){// j==3 and needle length==3
                return i;
            }
        }
        
        return -1;
    }
}