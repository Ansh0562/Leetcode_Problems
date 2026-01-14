class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums, target, 0, 0);
    }

    private int dfs(int[] nums, int target, int index, int sum) {

        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        int plus = dfs(nums, target, index + 1, sum + nums[index]);
        int minus = dfs(nums, target, index + 1, sum - nums[index]);

        return plus + minus;
    }
}

