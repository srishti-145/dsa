class Solution {
    public int characterReplacement(String s, int k) {
         HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxc = 0;  
        int maxl = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxc = Math.max(maxc, map.get(ch));

            while ((right - left + 1) - maxc > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxl = Math.max(maxl, right - left + 1);
        }
        return maxl;
    }
}