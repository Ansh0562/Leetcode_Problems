class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int n:nums){
            list.add(n);
        }

        Collections.sort(list,(a,b) -> {
            int FreqA = map.get(a);
            int FreqB = map.get(b);

            if(FreqA==FreqB){
                return b-a;
            }
            else{
                return FreqA-FreqB;
            }
        });

        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = list.get(i);
            
        }
        return ans;
    }
}
