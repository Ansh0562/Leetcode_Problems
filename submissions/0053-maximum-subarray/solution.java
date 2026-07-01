class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curr = nums[0];
        int max  = nums[0];
        for(int i=1;i<n;i++){
              if(curr<0){
                curr = 0;
            }
            curr += nums[i];
          
            max = Math.max(curr,max);
            
        }
        return max;
    }
}
