class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
         int count = 0;
    
        for (int i =0; i<row; i++) {
            for (int j =1 ;j < col; j++) {
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        for (int col1 =0; col1 <col; col1++) {
            for (int col2 =col1; col2<col; col2++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;

                for (int row1 =0; row1 <row; row1++) {
                    sum +=matrix[row1][col2] - (col1>0 ?matrix[row1][col1-1]:0);
                   count+=map.getOrDefault(sum-target,0);
                   map.put(sum,map.getOrDefault(sum,0)+1);

                 
                }
            }
        }
        return count;
    
     }
}