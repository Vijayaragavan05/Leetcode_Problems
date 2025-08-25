class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        StringBuilder ans= new StringBuilder();
        for(String str:words){
            // StringBuilder sb = new StringBuilder(str);
            // String rev = sb.reverse().toString();
            // ans+=" "+rev;
            ans.append(new StringBuilder(str).reverse());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}