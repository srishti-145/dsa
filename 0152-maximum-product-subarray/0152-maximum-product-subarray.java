class Solution {
    public int maxProduct(int[] nums) {
         int maxEnding = nums[0];
        int minEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            int tempMax = Math.max(curr,
                    Math.max(curr * maxEnding, curr * minEnding));

            int tempMin = Math.min(curr,
                    Math.min(curr * maxEnding, curr * minEnding));

            maxEnding = tempMax;
            minEnding = tempMin;

            ans = Math.max(ans, maxEnding);
        }

        return ans;
    }
}