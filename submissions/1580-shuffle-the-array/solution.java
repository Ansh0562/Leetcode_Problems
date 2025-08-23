class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=0;
        int r =n;
        int arr[] = new int[2*n];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=nums[l];
                l++;
            }
            else{
                arr[i]=nums[r];
                r++;
            }
        }
        return arr;
        
    }
}
