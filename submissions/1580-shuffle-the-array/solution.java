class Solution {
    public int[] shuffle(int[] nums, int n) {
       int a=0;
       int size = (nums.length)/2;
        int num1[]=new int[size];
        int num2[]= new int[size];
        int num3[] = new int[nums.length];
        for (int i=0;i<size;i++) {
            num1[i] = nums[i];
            num2[i] = nums[i+size];

        }
        for (int j=0;j<size;j++){
            num3[a]=num1[j];
            a++;
            num3[a]=num2[j];
            a++;
        }

        return num3;

    }
}
    
