class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq = 0;
        int answer = 0;
        for(int num:nums){
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num,count+1); 
            }
            else{
        map.put(num,1);}
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxFreq) {
        maxFreq = entry.getValue();
        answer = entry.getKey();
        }
        }
    return answer;
    }
}
