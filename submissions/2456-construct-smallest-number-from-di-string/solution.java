class Solution {
    public String smallestNumber(String pattern) {
    return Construct_Smallest(pattern);   
    }
    public static String Construct_Smallest(String s){
        int n = s.length();
        int [] ans = new int[n+1];
        Stack<Integer> st = new Stack<>();
        int c=1;
        for (int i=0;i<=n;i++){
            if(i==n || s.charAt(i)=='I') {
                ans[i] = c;
                c++;
                while (!st.isEmpty()) {
                    ans[st.pop()] = c;
                    c++;
                }
            }
            else{
                st.push(i);
            }

            }
        String str = "";
        for (int i = 0;i<ans.length;i++){
            str+=ans[i];
        }
        return str;

    }
}
