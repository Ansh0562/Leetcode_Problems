class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String [] str = s.split(" ");
        int a = str[str.length-1].length();
        return a;
    }
}
