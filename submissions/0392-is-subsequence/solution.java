class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int count = 0;
        
        for (int i = 0; i < t.length(); i++) {
            if (count < n && s.charAt(count) == t.charAt(i)) {
                count++;
            }
        }
        if (n == count) {
            return true;
        }
        else{
            return false;
        }
    }
}
