/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {   // use < instead of <= to stop early
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;    // keep mid, could be the first bad
            } else {
                low = mid + 1; // skip mid, it's definitely good
            }
        }

        // At the end, low == high and points to first bad version
        return low;
    }
}

