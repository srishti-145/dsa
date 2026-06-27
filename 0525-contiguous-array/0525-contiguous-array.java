class Solution {
    public int findMaxLength(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefix = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                prefix += -1;
            else
                prefix += 1;

            if (map.containsKey(prefix)) {
                max = Math.max(max, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }
        }

        return max;
    }
}