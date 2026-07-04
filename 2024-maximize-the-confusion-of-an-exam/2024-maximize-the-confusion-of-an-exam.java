class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;

        for (int right = 0; right < answerKey.length(); right++) {

            char ch = answerKey.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            
            int maxFreq = Math.max(
                    map.getOrDefault('T', 0),
                    map.getOrDefault('F', 0)
            );

            while ((right - left + 1) - maxFreq > k) {

                char remove = answerKey.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left++;

                
                maxFreq = Math.max(
                        map.getOrDefault('T', 0),
                        map.getOrDefault('F', 0)
                );
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
// there is also sliding window approach teo asliding window