class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int prev=0;
        for(int i=0;i<gain.length;i++){
            int sum=prev+gain[i];
            if(sum>max){
                max=Math.max(max,sum);
            }
            prev=sum;
        }
        return max;
    }
}