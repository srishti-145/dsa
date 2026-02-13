class Solution {
     int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        dp = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(text1, text2, n - 1, m - 1);
    }
     private int solve(String s1, String s2, int i, int j) {

        if(i < 0 || j < 0)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + solve(s1, s2, i - 1, j - 1);
        } 
        else {
            dp[i][j] = Math.max(
                    solve(s1, s2, i - 1, j),
                    solve(s1, s2, i, j - 1)
            );
        }

        return dp[i][j];
    }
}