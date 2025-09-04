class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }

        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                ans = nums[j];
            }
        }
        return ans;
    }
    static void swap(int nums[],int first,int second){
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
    }
    
}
