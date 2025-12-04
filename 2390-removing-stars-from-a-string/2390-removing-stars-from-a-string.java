class Solution {
    public String removeStars(String s) {
        // Stack<Character> st = new Stack<>();
        // int n = s.length();                                          
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)=='*'){
        //         st.pop();
        //     }
        //     else{
        //         st.push(s.charAt(i));
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!st.empty()){
        //     sb.append(st.pop());
        // }
        // return sb.reverse().toString();
        StringBuilder sb = new StringBuilder();
       for(char ch : s.toCharArray()){
            if(ch=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}