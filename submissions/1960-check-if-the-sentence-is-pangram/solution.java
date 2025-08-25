// class Solution {
//     public boolean checkIfPangram(String sentence) {
//             boolean []seen = new boolean[26];
//             for (char ch: sentence.toLowerCase().toCharArray()){
//                 if(ch >= 'a' && ch<='z'){
//                     seen[ch - 'a'] = true;
//                 }
//             }
//             for(boolean present:seen){
//                 if(!present) {return false;}
//             }
//             return true;

//     }
// }

import java.util.HashSet;

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        
        // add each character to set
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // only consider lowercase letters
                set.add(ch);
            }
        }
        
        // if set has 26 letters, it's a pangram
        return set.size() == 26;
    }
}

