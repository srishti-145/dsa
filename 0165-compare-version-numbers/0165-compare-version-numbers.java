class Solution {
    public int compareVersion(String version1, String version2) {
        String []arr=version1.split("\\.");
        String []brr=version2.split("\\.");
        int n=Math.max(arr.length,brr.length);

        for(int i=0;i<n;i++){

            int num1=(i<arr.length) ?  Integer.parseInt(arr[i]) : 0;
            int num2=(i<brr.length) ?  Integer.parseInt(brr[i]) : 0;

            if(num1<num2) return -1;
            if(num1>num2) return 1;
        }
        return 0;
    }
}