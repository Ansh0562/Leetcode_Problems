import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = Arrays.stream(candies).max().getAsInt(); // Find the max in original array
        ArrayList<Boolean> a1 = new ArrayList<>();

        for (int candy : candies) {
            a1.add(candy + extraCandies >= maxCandy); // Compare and add true/false
        }

        return a1; // Return the Boolean ArrayList
    }

    
}

