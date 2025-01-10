import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();

        
        l.add(new ArrayList<>());
        l.get(0).add(1);


        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = l.get(i - 1); 
            l.add(new ArrayList<>());        
            l.get(i).add(1);                

            for (int j = 0; j < pre.size() - 1; j++) {
                int r = pre.get(j) + pre.get(j + 1); 
                l.get(i).add(r);
            }

            l.get(i).add(1);
        }

        return l; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = sc.nextInt();

        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(numRows);

        // Print the Pascal's Triangle
        System.out.println(result);
    }
}

