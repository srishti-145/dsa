class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int l=0;
        int r=n-1;
        int ls=0;
        int rs=0;
        for(int i=0;i<k;i++){
            ls+=cardPoints[i];
        }
        l=k-1;
        int maxs=ls;
        while(l>=0){
            ls=ls-cardPoints[l];
            l--;
            rs=rs+cardPoints[r];
            r--;
            int temp=ls+rs;
            maxs=Math.max(maxs,temp);
        }
        return maxs;
            
    }
}