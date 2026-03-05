class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int temp=Math.abs(target-sum);
                if(temp<min){
                    min=temp;
                    ans=sum;
                }
                if(sum>target){
                    k--;
                }
                else{
                    j++;
                }


            }
        }
        return ans;
    }
}