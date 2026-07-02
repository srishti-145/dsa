class Solution {
    public int longestSubarray(int[] nums) {
        int cz=0;
        int maxl=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cz++;
            }
            while(cz>1){
                if(nums[l]==0){
                    cz--;
                }
                l++;
            }
            maxl=Math.max(maxl,i-l);
        }
        return maxl;
    }
}