class Solution {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] sorted = new String[words.length];

        for(String n:words){
            int idx = n.charAt(n.length()-1)-'1';
            sorted[idx] = n.substring(0,n.length()-1);

        }
        return String.join(" ",sorted);
    }
}
