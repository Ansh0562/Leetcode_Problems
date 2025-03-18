class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int digit = x % 10;
            // Check for overflow before multiplying or adding
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            ans = ans * 10 + digit;
            x = x / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = 1534236469;
        System.out.println("Reversed: " + sol.reverse(x));  // Output should be 0 due to overflow
    }
}

