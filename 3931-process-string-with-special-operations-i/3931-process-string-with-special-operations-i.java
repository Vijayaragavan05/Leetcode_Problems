class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch :s.toCharArray()){
            if(ch!='*' && ch!='#' && ch!='%'){
                sb.append(ch);
            }
            else if(ch=='#'){
                sb.append(sb.toString());
            }
            else if(ch=='%'){
                sb.reverse();
            }
            else{
                if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}