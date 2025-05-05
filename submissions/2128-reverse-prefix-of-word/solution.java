class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch) + 1;
        if (i == 0) return word; // ch not found in word
        return new StringBuilder(word.substring(0, i))
            .reverse()
            .append(word.substring(i))
            .toString();
    }
}


