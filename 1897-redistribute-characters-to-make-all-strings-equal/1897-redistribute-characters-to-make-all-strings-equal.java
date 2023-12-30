class Solution {
    public boolean makeEqual(String[] words) {
        //string[]={ramm,ramm,ram}//length==3
        //ocuurance of r=3 a=3 m=5 which not divisible by 3 so return false val

        int[] count=new int[26];
        for(String s:words){ 
            for(char c:s.toCharArray()){ //give character of array "abc"
                count[c-'a']++; //a-a=0 palce count+1
            }
        }
        for(int i:count){
            if(!(i%words.length==0)){
                return false;
            }
        }
        return true;
    }
}