class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            int max=nums[i];
            int maxd=0;
            for(int j=i;j<nums.length;j++){
               min=Math.min(min,nums[j]);
               max=Math.max(max,nums[j]);
               
                maxd=max-min;
                sum=sum+maxd;
            }
        }
        return sum;
    }
}