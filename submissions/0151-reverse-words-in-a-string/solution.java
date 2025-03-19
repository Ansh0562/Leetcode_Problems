class Solution {
    public String reverseWords(String s) {
    String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        // Reverse the words and concatenate into a single string
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        String n = result.toString();
        return n;
    }
}
