class Solution {
    public int maxScore(String s) {
       int n = s.length();
        int[] suffix = new int[n];

        // Build suffix array (count of 1's)
        suffix[n - 1] = (s.charAt(n - 1) == '1') ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1];
            if (s.charAt(i) == '1') {
                suffix[i]++;
            }
        }

        int left = 0;
        int ans = 0;

        // Try every valid split
        for (int i = 0; i < n - 1; i++) {

            if (s.charAt(i) == '0') {
                left++;
            }

            ans = Math.max(ans, left + suffix[i + 1]);
        }

        return ans;  
    }
}