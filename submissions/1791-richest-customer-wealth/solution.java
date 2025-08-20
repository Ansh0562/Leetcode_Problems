import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
       int n = accounts.length; 
       int ans[] = new int[n];
       for (int row=0;row<n;row++){
        int sum=0;
        for (int col = 0 ; col<accounts[row].length;col++){
            sum += accounts[row][col];

        }
        ans[row]=sum;

       }
       Arrays.sort(ans);
       int max = ans[ans.length-1];
       return max; 
    }
}
