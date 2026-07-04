class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey, k, 'T'),
                        helper(answerKey, k, 'F'));
    }

    private int helper(String s, int k, char ch) {
        int left = 0;
        int changes = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

           
            if (s.charAt(right) != ch)
                changes++;

           
            while (changes > k) {
                if (s.charAt(left) != ch)
                    changes--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
// there is also hashmap way of doing it which is usedin mul patterns