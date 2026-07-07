class Solution {
    public long sumAndMultiply(int n) {
       long rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        long x = 0;
        long sum = 0;

        while (rev > 0) {
            int digit = (int)(rev % 10);

            if (digit != 0) {
                x = x * 10 + digit;
                sum += digit;
            }

            rev /= 10;
        }

        return x * sum;
    }
}