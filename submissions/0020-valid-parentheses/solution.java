import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] chr = s.toCharArray();
        boolean flag = true;
        
        for (char c : chr) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (!st.isEmpty()) {
                char p = st.pop();
                if ((c == ')' && p == '(') ||
                    (c == '}' && p == '{') ||
                    (c == ']' && p == '[')) {
                    continue;
                } else {
                    flag = false;
                    return flag;
                }
            } else {
                flag = false;
                return flag;
            }
        }
        
        if (!st.isEmpty()) {
            flag = false;
        }
        
        return flag;
    }
}
