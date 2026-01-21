class Solution {
    public boolean hasAlternatingBits(int n) {
        String Binary = Integer.toBinaryString(n);
        int len = Binary.length();
        for (int i=0;i<len-1;i++){
            if(Binary.charAt(i)==Binary.charAt(i+1)){
                return false;
            }
        
        }
        return true;
    }
}
