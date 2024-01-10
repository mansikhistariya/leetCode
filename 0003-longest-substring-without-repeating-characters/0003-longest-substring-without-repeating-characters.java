class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int start=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                if(start<=map.get(c)){
                    start=map.get(c)+1;
                }
            }
        len=Math.max(len,i-start+1);
        map.put(c,i);
        }
        
       return len; 
    }
    
}