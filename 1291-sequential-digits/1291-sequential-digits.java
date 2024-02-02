class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> result=new ArrayList<>();
        String s=String.valueOf(low);
        String s1=String.valueOf(high);
        int n1=s.length();
        int n2=s1.length();
        String d="123456789";
        for(int i=n1;i<=n2;i++){
            for(int j=0;j<=9-i;j++){
                int num=Integer.parseInt(d.substring(j,j+i));
                if(num>=low && num<=high){
                    result.add(num);
                }
            }
           
            
        }
        return result;
    }
}