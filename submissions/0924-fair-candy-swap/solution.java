import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = Arrays.stream(aliceSizes).sum();
        int sum2 = Arrays.stream(bobSizes).sum();
        int result[] = new int[2];
        int diff = (sum1 - sum2) / 2;

    
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == diff) {
                    result[0] = aliceSizes[i];
                    result[1] = bobSizes[j];  
                    return result;
                }
            }
        }
        return result;
    }
}

