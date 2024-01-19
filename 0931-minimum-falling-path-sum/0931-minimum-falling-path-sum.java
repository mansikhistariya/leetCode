class Solution {
    public int minFallingPathSum(int[][] matrix) {
       int s=matrix[0].length;
       int k=matrix.length;
       int path=Integer.MAX_VALUE;
       HashMap<String,Integer> store=new HashMap<>();
       for(int i=0;i<s;i++){
           path=Math.min(path,rec(0,i, matrix,store));

       }
         return path;

    }
    private static int rec(int i,int j,int arr[][],HashMap<String,Integer> store){
        int r=arr.length;
        int k=arr[0].length;
        if(i==r){
            return 0;
        }
        if(j<0 || j>=k){
            return Integer.MAX_VALUE;
        }
        String key=i+" N"+j;
        if(store.containsKey(key)){
            return store.get(key);
        }
        int o1=rec(i+1,j-1,arr,store);
         int o2=rec(i+1,j,arr,store);
          int o3=rec(i+1,j+1,arr,store);
        
           if (j - 1 >= 0) {
            o1 = Math.min(o1, rec(i + 1, j - 1, arr, store));
        }

        if (j + 1 < k) {
            o3 = Math.min(o3, rec(i + 1, j + 1, arr, store));
        }

        store.put(key, arr[i][j] + Math.min(o2, Math.min(o1, o3)));
        return arr[i][j] + Math.min(o2, Math.min(o1, o3));
    }
} 