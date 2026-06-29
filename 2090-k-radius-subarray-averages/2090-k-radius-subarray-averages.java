class Solution {
    public int[] getAverages(int[] nums, int k) {
         int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        int windowSize = 2 * k + 1;

        
        if (windowSize > n) {
            return ans;
        }

        long windowSum = 0;

        
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }

        int center = k;
        ans[center] = (int)(windowSum / windowSize);

        
        for (int right = windowSize; right < n; right++) {

            
            windowSum += nums[right];

           
            windowSum -= nums[right - windowSize];

            center++;
            ans[center] = (int)(windowSum / windowSize);
        }

        return ans;
    }
}