class Solution {
    public int majorityElement(int[] nums) {
         int number =0,count=0;

        for (int num : nums){
            if(count==0){
                number=num;
            }
            count+=(num==number)?1:-1;

        }
        return number;
        
    }
}
