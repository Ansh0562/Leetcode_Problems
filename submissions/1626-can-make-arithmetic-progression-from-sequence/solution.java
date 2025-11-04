class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int abs=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]+abs){
                return false;
            }
        }
        
        return true;
    }
}
