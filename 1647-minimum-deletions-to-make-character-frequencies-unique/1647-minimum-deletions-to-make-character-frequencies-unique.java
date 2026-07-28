class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        HashSet<Integer> used = new HashSet<>();

        int ans = 0;

        for (int f : freq) {

            while (f > 0 && used.contains(f)) {
                f--;
                ans++;
            }

            if (f > 0)
                used.add(f);
        }

        return ans;
    }
}