class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int [][]dp=new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = -1;
            }
        }

        return solve(0,0,word1,word2,dp,n,m);
    }
    public int solve(int i,int j,String s1,String s2,int [][]dp,int n,int m){
        if(i==n){
            return m-j;
        }
        if(j==m){
            return n-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=solve(i + 1, j + 1, s1, s2, dp,n,m);
        }

        int ins=solve(i, j + 1, s1, s2, dp,n,m);
        int del=solve(i + 1, j, s1, s2, dp,n,m);
        int rep=solve(i + 1, j + 1, s1, s2, dp,n,m);

        return dp[i][j]=1+Math.min(ins,Math.min(del,rep));
    }
}