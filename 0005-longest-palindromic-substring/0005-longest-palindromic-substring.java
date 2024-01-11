class Solution {
    public String longestPalindrome(String s) {
        String lps="";
        for(int i=0;i<s.length();i++){
            int low=i;
            int high=i;
            while( low >= 0 && high < s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if((low==-1) || (high==s.length())){
                    break;
                }
            }
                String palindrom= s.substring(low+1,high);
                if(palindrom.length()>lps.length()){
                    lps=palindrom;
                }
            
                low=i-1;
                high=i;
                while( low >= 0 && high < s.length() && s.charAt(low)==s.charAt(high)){
                    low--;
                    high++;
                    if((low==-1) || (high==s.length())){
                    break;
                }
                }
                
                
                palindrom= s.substring(low+1,high);
                if(palindrom.length()>lps.length()){
                    lps=palindrom;
                }
            
        }
        return lps;
    }
}