
class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int [] a1= new int [size];
        int [] a2 = new int [size];
        a1[0] = height[0];
        for (int  i = 1 ; i<size ; i++){
            if (a1[i-1]>height[i]){
                a1[i] = a1[i-1];
            }
            else{
                a1[i]= height[i];
            }
        }
        a2[size-1] = height[size-1];
        for (int i= size-2 ; i >= 0 ; i--){
            if (a2[i+1] >= height[i]){
                a2[i] = a2[i+1];
            }
            else{
                a2[i] = height[i];
            }
        }
        int sum =0;
        int max =0;
        for(int i =0 ; i < size ; i++){
            sum += Math.min(a1[i],a2[i])-height[i];
        }
        return sum;
    }
}
