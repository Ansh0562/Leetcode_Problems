class Solution {
    public String defangIPaddr(String address) {
        String a1=address.replace(".","[.]");
        return a1;
    }
}
