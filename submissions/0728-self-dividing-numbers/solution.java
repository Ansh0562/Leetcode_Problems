class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n =i;
            boolean isSelfDividing = true;
            while (n > 0) {
            int digit = n % 10;
            if (digit==0 || i % digit!=0){
                isSelfDividing = false;
                break;
            }
            n = n / 10;

}
        
        if(isSelfDividing){
        res.add(i);}
        }
      return res;
    }
}
