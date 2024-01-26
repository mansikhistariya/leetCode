class Solution {
    private static final int MOD = 1_000_000_007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] memo = new int[m][n][maxMove + 1];
        for (int[][] row : memo) {
            for (int[] col : row) {
                Arrays.fill(col, -1);
            }
        }
        return dfs(startRow, startColumn, maxMove, m, n, memo);
    }

    private int dfs(int row, int col, int moves, int m, int n, int[][][] memo) {
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 1;  // We found a path out of the grid
        }

        if (moves == 0) {
            return 0;  // No more moves left
        }

        if (memo[row][col][moves] != -1) {
            return memo[row][col][moves];
        }

        int count = 0;

        // Explore all four possible moves
        count = (count + dfs(row - 1, col, moves - 1, m, n, memo)) % MOD;
        count = (count + dfs(row + 1, col, moves - 1, m, n, memo)) % MOD;
        count = (count + dfs(row, col - 1, moves - 1, m, n, memo)) % MOD;
        count = (count + dfs(row, col + 1, moves - 1, m, n, memo)) % MOD;

        memo[row][col][moves] = count;

        return count;
    }
}


// class Solution {
//     public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//         return dfs(startRow,startColumn,maxMove,m,n);
//     }

//     int dfs(int row,int col,int move, int m, int n) {
//         if (row < 0|| row >= m || col < 0 || col >= n) {
//             return 1;  
//         }
//         if (move== 0) {
//             return 0;  
//         }

//         int count = 0;

       
//         count += dfs(row - 1, col, move- 1, m, n);
//         count += dfs(row + 1, col, move- 1, m, n);
//         count += dfs(row, col - 1, move- 1, m, n);
//         count += dfs(row, col + 1, move- 1, m, n);

//         return count;
//     }
// }
