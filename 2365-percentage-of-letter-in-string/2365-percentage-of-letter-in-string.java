class Solution {
    public int percentageLetter(String s, char l) {
        int c=0;
        int n =s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch==l){
                c++;
            }
        }
        return (c*100)/n;
    }
}