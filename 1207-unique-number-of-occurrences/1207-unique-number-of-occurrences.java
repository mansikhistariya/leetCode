class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] a=new int[2001];
        
       for(int i:arr){
         a[i+1000]++;
         
       } 
        Arrays.sort(a);
       for(int i=0;i<a.length-1;i++){
               if(a[i]!=0 && a[i]==a[i+1]){
                   return false;
          
           }
       }
       return true;
    }
}