class Solution {
    public String reversePrefix(String word, char ch) {
        String s = "";
        String s1 = "";
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            s += c;  
            if(c==ch){
                String rev = reverse(s);
                s1 = word.substring(i+1);
                return rev + s1;
            }
        }
        return word;
    }
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}