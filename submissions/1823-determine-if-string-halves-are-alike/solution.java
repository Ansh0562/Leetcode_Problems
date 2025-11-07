class Solution {
    public boolean halvesAreAlike(String s) {
       int mid = s.length()/2;
       int v1=0;
       int i=0;
       for(i=0;i<mid;i++){
        char c = s.charAt(i);
        if(c=='a' || c=='e'|| c=='i' ||c=='o'||c=='u'||c=='A' || c=='E'|| c=='I' ||c=='O'||c=='U'){
            v1++;
        }
       }
         for(int j=i;j<s.length();j++){
            char c = s.charAt(j);
        if(c=='a' || c=='e'|| c=='i' ||c=='o'||c=='u'||c=='A' || c=='E'|| c=='I' ||c=='O'||c=='U'){
            v1--;
        }
        
       }
       return v1==0;     
    }
}
