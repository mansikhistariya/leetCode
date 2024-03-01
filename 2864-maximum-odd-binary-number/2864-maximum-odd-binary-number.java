class Solution {
    public String maximumOddBinaryNumber(String s) {
        String k="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        char[] ch=s.toCharArray();
        ch[ch.length-1]='1';
        count--;
        int i=0;
        for(int c=1;c<=count;c++){
            ch[i++]='1';
        }   
        for(;i<ch.length-1;i++){
            ch[i]='0';
        } 

    return String.valueOf(ch);
       
    }
}