class Solution {
    public int minOperations(int[] nums, int x) {
         
        int total = 0;
        for (int num : nums)
            total += num;

        int target = total - x;

        if (target < 0)
            return -1;

        if (target == 0)
            return nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;
        int maxLen = -1;

        for (int i = 0; i < nums.length; i++) {

            prefix += nums[i];

            if (map.containsKey(prefix - target)) {
                int len = i - map.get(prefix - target);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence only
            map.putIfAbsent(prefix, i);
        }

        return maxLen == -1 ? -1 : nums.length - maxLen;

    }
}