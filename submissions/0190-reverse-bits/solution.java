class Solution {
    public int reverseBits(int n) {
        String binary32 = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String reversed = new StringBuilder(binary32).reverse().toString();
        int result = (int) Long.parseLong(reversed,2);
        return result;
    }
}
