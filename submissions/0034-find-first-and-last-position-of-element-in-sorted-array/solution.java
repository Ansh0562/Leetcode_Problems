class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }
    static int search(int[] arr, int target,boolean occ){
        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                result = mid;
            
            if(occ){
                right = mid-1;
            }else{
                left = mid+1;
            }
            }
            else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return result;
    }
}
