class Solution {
    public String interpret(String command) {
       String a=command.replace("G","G").replace("()","o").replace("(al)","al");
        return a;
    }
}
