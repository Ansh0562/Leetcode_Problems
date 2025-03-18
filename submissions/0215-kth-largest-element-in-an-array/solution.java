class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[nums.length-k];
        return min;
        
    }
}
