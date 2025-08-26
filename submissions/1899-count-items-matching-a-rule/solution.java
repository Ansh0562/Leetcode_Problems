class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int idx=0;
        String arr [] = {"type","color","name"};
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(ruleKey)){
                idx = i;
            }
        }
        for (int i=0;i<items.size();i++){
            
                if(items.get(i).get(idx).equals(ruleValue)){
                    count++;
                }
            
        }
        
        
        return count;
    }
}
