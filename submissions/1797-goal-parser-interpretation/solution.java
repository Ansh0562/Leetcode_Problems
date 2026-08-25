class Solution {
    public String interpret(String command) {
        String ans = command.replace("G","G").replace("()","o").replace("(al)","al");
        return ans;
    }
}
