class Solution {
    public String makeSmallestPalindrome(String s) {
        char ch[] = s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                char s1 = (char) Math.min(ch[i], ch[j]);
                ch[i]=ch[j]=s1;  
            }
            i++;
            j--;
        }
        return new String(ch);
    }
}