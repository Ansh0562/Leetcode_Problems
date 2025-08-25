class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = nums.clone();
        Arrays.sort(ans);
        Map<Integer,Integer>map = new HashMap();
        for(int i=0;i<ans.length;i++){
            map.putIfAbsent(ans[i],i);
        }
        int []result = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            result[i]=map.get(nums[i]);
        }
        return result;
    }
}
