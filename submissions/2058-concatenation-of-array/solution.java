class Solution {
    public int[] getConcatenation(int[] nums) {
    int ans[] = new int [2*nums.length];
     // copy first half
    for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        // copy second half
        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = nums[i];
        }
    return ans;
}
}
