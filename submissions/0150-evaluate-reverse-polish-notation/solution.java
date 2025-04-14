class Solution {
    public int evalRPN(String[] tokens) {
       
        Stack<Integer> st = new Stack<>();
        for(String i : tokens){
            if(i.equals("+")||i.equals("-")||i.equals("*")||i.equals("/")){
                int a = st.pop();
                int b = st.pop();
                int res = 0;
                char j=i.charAt(0);
                switch(j)
                {
                case '+':
                res = b+a;
                break;
                case '-':
                res = b-a;
                break;
                case '*':
                res = b*a;
                break;
                case '/':
                res = b/a;
                break;
                default:res=0;
                }
                st.push(res);


            }
            else
            st.push(Integer.parseInt(i));

        }
        return st.pop();
        
    }
}
