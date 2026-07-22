class Solution {
    public int[] findErrorNums(int[] nums) {
         long n = nums.length;

        long expectedSum = n * (n + 1) / 2;
        long expectedSquareSum = n * (n + 1) * (2 * n + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int num : nums) {
            actualSum += num;
            actualSquareSum += 1L * num * num;
        }

        long diff = actualSum - expectedSum;                
        long squareDiff = actualSquareSum - expectedSquareSum;

        long sum = squareDiff / diff;                       
        int duplicate = (int) ((diff + sum) / 2);
        int missing = (int) (sum - duplicate);

        return new int[]{duplicate, missing};
    }
}