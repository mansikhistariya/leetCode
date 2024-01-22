class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a = new int[2];
        int[] b=new int[nums.length];
        

        for (int i :nums) {
            b[i-1]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]==2){
                a[0]=i+1;
            }
            if(b[i]==0){
                a[1]=i+1;
            }
        }
        return a;
    }
}