import java.util.Arrays;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int num2[] = new int[accounts.length];
        int sum=0;
        for (int i =0;i < accounts.length;i++){
            for (int j=0;j<accounts[i].length;j++){
                sum = Arrays.stream(accounts[i]).sum();
                num2[i]=sum;
            }


        }
        
        return  Arrays.stream(num2).max().getAsInt();
        
    }
}
