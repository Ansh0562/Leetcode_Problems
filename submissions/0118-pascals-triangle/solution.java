class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.get(0).add(1);

        for (int i=1 ; i< numRows ; i++){
            List<Integer> pre  = l.get(i-1);
            l.add(new ArrayList<>());
            l.get(i).add(1);
        
        for (int j=0; j< pre.size()-1;j++){
            int r = pre.get(j) + pre.get(j+1);
            l.get(i).add(r);
            



        }
        l.get(i).add(1);
        

    }
    return l;
}
}
