class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int count = 0;
        int [] result = new int[size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(nums[i]>nums[j]){
                    count++;
                }

            }
            result[i]=count;
            count=0;


        }

        return result;
        
    }
}
