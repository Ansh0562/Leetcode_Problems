class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(0,nums,new ArrayList<>(),result);
    return result;
        
    }
    static void backtrack(int idx,int []nums,List<Integer>current ,List<List<Integer>> result){
        if(idx==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        backtrack(idx+1,nums,current,result);

        current.remove(current.size()-1);
        backtrack(idx+1,nums,current,result);
    }
}
