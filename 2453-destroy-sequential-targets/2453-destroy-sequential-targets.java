class Solution {
    public int destroyTargets(int[] nums, int space) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int rem = num % space;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;

        
        for (int num : nums) {
            int rem = num % space;
            int freq = map.get(rem);

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = num;
            } else if (freq == maxFreq) {
                ans = Math.min(ans, num);
            }
        }

        return ans;
    }
}