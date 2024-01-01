class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s); 
       int count=0;
       int j=0;
       for(int i:g){
              while(j<s.length && s[j]<i){
                  j++;
                  }

                  if(j==s.length){
                      return count;
                  }
                  else{
                      j++;
                      count++;
                  }
               
               
           

       }
       return count;
    }

}