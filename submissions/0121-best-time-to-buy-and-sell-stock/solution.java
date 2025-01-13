class Solution {

    public int maxProfit(int[] prices) {
        int size = prices.length;
        int ar[] = new int[size];
        ar[size-1] = prices[size-1];
        for(int i = size-2; i>=0;i--){
            if(ar[i+1]>=prices[i]){
                ar[i] = ar[i+1];
            }
            else{
                ar[i] = prices[i];
            }
        }

        int max = 0;
        for(int i = 0; i<size; i++){
            int diff = ar[i] - prices[i];
            if(max < diff){
                max = diff;
            }
        }
        return max;
}

}
