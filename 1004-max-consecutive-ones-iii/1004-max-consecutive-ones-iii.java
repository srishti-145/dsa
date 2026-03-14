class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int maxl=0;
        int cz=0;
        while(r<n){
           if(nums[r]==0){
            cz++;
           }
           if(cz>k){
            if(nums[l]==0){
                cz--;
            }
            l++;
           }
           if(cz<=k){
            int len=r-l+1;
            maxl=Math.max(maxl,len);
           }
           r++;

        }
        return maxl;
    }
}