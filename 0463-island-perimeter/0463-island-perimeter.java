class Solution {
    public int islandPerimeter(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    if(i==0 || grid[i-1][j]==0){
                        count++;
                    }
                     if( j==0 || grid[i][j-1]==0){
                        count++;
                    } if( j==m-1 || grid[i][j+1]==0){
                        count++;
                    } if( i==n-1 || grid[i+1][j]==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}