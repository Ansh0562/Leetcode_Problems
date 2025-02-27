import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num2 = nums.clone();
        int[] joinedArray = Arrays.copyOf(nums, nums.length + num2.length);
        System.arraycopy(num2, 0, joinedArray, nums.length, num2.length);
        
        return joinedArray; // Return the array instead of a string
    }
}

