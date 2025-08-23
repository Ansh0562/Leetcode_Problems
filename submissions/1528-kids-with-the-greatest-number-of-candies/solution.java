class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = candies[0];
        int ans[] = new int[candies.length];
        for (int i=0;i<candies.length;i++){
            if(maxcandies < candies[i]){
                maxcandies = candies[i];
            }

        }
         List<Boolean> result = new ArrayList<>();

        // Step 3: Check condition for each kid
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= maxcandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;

    }
}
