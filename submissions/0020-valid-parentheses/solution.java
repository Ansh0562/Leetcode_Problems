
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char [] chr = s.toCharArray();
        for (int i=0 ; i < chr.length ; i++){
            char ch = chr[i];
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            
            else 
            {
                if(stack.isEmpty())
                return false;
                char ch1 = stack.pop();
                if(!(ch1=='[' && ch ==']' ||
                 ch1 =='(' && ch == ')' ||
                 ch1 == '{' && ch =='}'))
                   
                    return false;
                }}
            return(stack.isEmpty());
          
    }
}
