class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum =0;
        int count = Integer.MAX_VALUE;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                int size = r-l+1;
                count = Math.min(size,count);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        if(count==Integer.MAX_VALUE){
            return 0;
        }
        return count;
    }
}
