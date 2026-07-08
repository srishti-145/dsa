class Solution {
    public int countCompleteSubarrays(int[] nums) {
         int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }

        int totalDistinct = set.size();

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() == totalDistinct) {

                // Every subarray ending from right to n-1 is complete
                ans += (n - right);

                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0)
                    map.remove(nums[left]);

                left++;
            }
        }

        return ans;
    }
}