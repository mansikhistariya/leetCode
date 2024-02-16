class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            s.put(arr[i],s.getOrDefault(arr[i], 0)+1);   
        }
        ArrayList<Integer> a=new ArrayList<>();
        int count=0;
        for(int z :s.values()){
            a.add(z);
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++){
            if(k>a.get(i)){
                k=k-a.get(i);
                a.set(i,0);
            }else{
                a.set(i,a.get(i)-k);
                k=0;
            }
            if(a.get(i)!=0){
                count++;
            }
        }
        return count;
    }
}