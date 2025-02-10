public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int lenA = 0;
        while(temp1 != null){
            lenA++;
            temp1 = temp1.next;
        }
        int lenb = 0;
        while(temp2 != null){
            lenb++;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        if(lenA > lenb){
            int stp = lenA - lenb;
            for(int i = 1; i <= stp; i++){
                temp1 = temp1.next;
            }
        }else{
            int stp = lenb - lenA;
            for(int i =1; i <= stp; i++){
                temp2 = temp2.next;
            }
        }
         while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
        
    }
}
