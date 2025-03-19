class Solution {
    public int climbStairs(int n) {
        return ClimbStair(n);      
    }
     public static int ClimbStair(int n){
        if(n<=2){
            return n;
        }
        int first = 1;
        int second =1;
        int result = 0;
        for (int i=2 ; i<=n ;i++){
            result = first+second;
            first=second;
            second = result;
        }
        return result;
    }

}
