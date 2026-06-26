class Solution {
    public int minSubArrayLen(int target, int[] n) {
        int i=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        boolean flag=false;
        for(int j=i;j<n.length;j++){
            sum+=n[j];
            while(sum>=target){
                min=Math.min(min,j-i+1);
                flag=true;
                sum-=n[i];
                i++;
            }
        }
        if(flag){
             return min;
        }
        return 0;
    }
}