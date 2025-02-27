class Solution {
    public int[] runningSum(int[] nums) {
        int[] num2 = new int[nums.length];
        num2[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            num2[i] = num2[i-1]+nums[i];


        }
        return num2;
        
    }
}
