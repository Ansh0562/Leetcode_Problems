class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            int start = 0, end = image[row].length - 1;

            while (start <= end) { 
                // Swap and invert at the same time
                int left = image[row][start] ^ 1; // invert
                int right = image[row][end] ^ 1;  // invert

                // Swap
                image[row][start] = right;
                image[row][end] = left;

                start++;
                end--;
            }
        }
        return image;
    }
}

