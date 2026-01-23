class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean[] isPrime = new boolean[33];
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int p : primes) isPrime[p] = true;

        int result = 0;

        for (int n = left; n <= right; n++) {
            int count = 0;
            int x = n;
            while (x > 0) {
                count += (x & 1);
                x >>= 1;
            }

            if (isPrime[count]) {
                result++;
            }
        }
        return result;
    }
}

