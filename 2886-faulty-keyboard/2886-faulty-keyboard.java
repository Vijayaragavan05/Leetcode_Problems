class Solution {
    public String finalString(String s) {
    //     String ans = "";
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         if (ch == 'i') {
    //             ans = rev(ans);
    //         } else {
    //             ans += ch;
    //         }
    //     }
    //     return ans;
    // }

    // public String rev(String ch) {
    //     String s = "";
    //     int n = ch.length();
    //     for (int i = n - 1; i >= 0; i--) {
    //         s += ch.charAt(i);
    //     }
    //     return s;

        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='i'){
                str.append(ch);
            }
            else{
                str.reverse();
            }
        }
        return str.toString();
    } 
}
