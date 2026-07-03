class Solution {
    public int maxFrequency(int[] nums, int k) {
         Arrays.sort(nums);

        long ps = 0;
        int j = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ps += nums[i];

            while ((long) nums[i] * (i - j + 1) - ps > k) {
                ps -= nums[j];
                j++;
            }

            ans = Math.max(ans, i - j + 1);
        }

        return ans;
    }
}