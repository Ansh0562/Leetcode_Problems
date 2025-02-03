class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleaned);
        String rev = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            rev += cleaned.charAt(i);
        }
        if (cleaned.equals(rev)){
            return true;
        }
        else {
            return false;
        }
        
    }
}
