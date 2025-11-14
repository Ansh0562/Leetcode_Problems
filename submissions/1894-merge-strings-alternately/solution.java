class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        // Merge while both have characters
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // Add remaining characters (if any)
        if (i < word1.length()) result.append(word1.substring(i));
        if (j < word2.length()) result.append(word2.substring(j));

        return result.toString();
    }
}

