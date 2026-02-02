class Solution {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum =0;
        int pow =1;
        ListNode temp = head;
        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n= list.size()-1;
        for(int i=n;i>=0;i--){
            sum += (list.get(i)*pow);
            pow = pow*2;
        }

       return sum; 
    }
}
