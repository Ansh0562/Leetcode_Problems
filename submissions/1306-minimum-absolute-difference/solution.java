class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        // Find minimum absolute difference
        int abs = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            abs = Math.min(abs, arr[i] - arr[i - 1]);
        }

        // Now collect all pairs with that minimum difference
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[j] - arr[i] == abs) {
                List<Integer> al = new ArrayList<>();
                al.add(arr[i]);
                al.add(arr[j]);
                result.add(al);
            }
            i++;
            j++;
        }

        return result;
    }
}

