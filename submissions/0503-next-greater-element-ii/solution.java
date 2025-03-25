class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack();
        int n=nums.length;
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);

        for(int i=0;i<2*n;i++){
            int index=i%n;

            while(!stack.isEmpty() && nums[index]> nums[stack.peek()]){
                int ind=stack.pop();
                res[ind]=nums[index];
            }
             
             stack.push(index);
             
                    }
                    return res;
                    
    }               

}
