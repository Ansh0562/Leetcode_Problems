class Solution {
    public int mostWordsFound(String[] sentences) {
     int count = 0;
        //String s1 = sentences[1];
        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];

            ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
            int m = list.size();
            if(count <= m) {
                count = 0;
                count += m;
            }
        }
        return count;  
    }
}
