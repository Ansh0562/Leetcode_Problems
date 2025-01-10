class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.get(0).add(1);
        l.add(new ArrayList<>());
        l.get(1).add(1);
        l.get(1).add(1);
        for (int i = 2 ; i <= rowIndex; i++){
            List<Integer> pre  = l.get(i-1);
            l.add(new ArrayList<>());
            l.get(i).add(1);
            for (int j = 0 ; j < pre.size()-1 ; j++){
                int r = pre.get(j)+ pre.get(j+1);
                l.get(i).add(r);
            }
            l.get(i).add(1);
        }
          return l.get(rowIndex);  
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int rowIndex = sc.nextInt();
            Solution solution = new Solution();
            List<Integer> result = solution.getRow(rowIndex);
            System.out.println(result.get(rowIndex));
        
    }
}
