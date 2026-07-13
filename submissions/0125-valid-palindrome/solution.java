class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l =0;
        int r = result.length()-1;
        while(l < r){
            if(result.charAt(l)!=result.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
