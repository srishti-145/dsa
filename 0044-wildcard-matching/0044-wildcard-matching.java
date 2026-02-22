class Solution {
    public boolean isMatch(String s, String p) {
    int n=s.length();
    int m=p.length();
    Boolean [][]dp=new Boolean[n][m];
   
    return solve(0,0,n,m,s,p,dp);   
    }
    public boolean solve(int i,int j,int n,int m,String s,String p,Boolean [][]dp){
        if(i == n && j == m) return true;

        if(j == m && i < n) return false;

        if(i == n && j < m){
            for(int k = j; k < m; k++){
                if(p.charAt(k) != '*') return false;
            }
            return true;
        }
        if(dp[i][j] != null)
            return dp[i][j];

        boolean ans;    
        
        if(s.charAt(i) == p.charAt(j) || p.charAt(j)=='?'){
             ans=solve(i+1,j+1,n,m,s,p,dp);
        }
        else if(p.charAt(j)=='*'){
             ans=solve(i,j+1,n,m,s,p,dp)||solve(i+1,j,n,m,s,p,dp);
        }
        else{
             ans=false;
        }
        dp[i][j]=ans;
        return ans;
    }
}