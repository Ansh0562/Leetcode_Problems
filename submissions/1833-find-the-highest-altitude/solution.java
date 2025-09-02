class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;   // Start at 0
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g; // update altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    
    }
}
