class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int [][]dp=new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        int ans=Integer.MAX_VALUE;

        for(int j=0;j<n;j++){
            ans=Math.min(ans,solve(0,j,matrix,dp));
        }
        return ans;
    }
    public int solve(int i,int j,int[][]matrix,int [][]dp){
        int n=matrix.length;
        if(j>=n || j<0){
            return  Integer.MAX_VALUE; 
        }
        if(i==n-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int down = solve(i+1, j, matrix, dp);
        int leftDiag = solve(i+1, j-1, matrix, dp);
        int rightDiag = solve(i+1, j+1, matrix, dp);
        
         dp[i][j] = matrix[i][j] + Math.min(down, Math.min(leftDiag, rightDiag));
         return dp[i][j];
    }
}