class Solution {
    public int numWays(String s) {
        long MOD = 1000000007;
        int n = s.length();
        
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        // If total 1's not divisible by 3 → no valid split
        if (totalOnes % 3 != 0) return 0;

        // Case: No '1' in the string → choose 2 splitting points from (n-1)
        if (totalOnes == 0) {
            long ways = ((long)(n - 1) * (n - 2) / 2) % MOD;
            return (int) ways;
        }

        int onesPerPart = totalOnes / 3;

        long firstGap = 0;
        long secondGap = 0;
        int count = 0;

        // Count gaps between key split points
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') count++;

            if (count == onesPerPart) {
                firstGap++;
            } 
            else if (count == 2 * onesPerPart) {
                secondGap++;
            }
        }

        long result = (firstGap * secondGap) % MOD;
        return (int) result;
    }
}

