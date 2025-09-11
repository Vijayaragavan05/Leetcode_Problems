class Solution {
    public String sortSentence(String s) {
        // String words[] = s.split(" ");
        // Arrays.sort(words);
        // String str="";
        // for(String ch:words){
        //     str+=ch;
        // }
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isLetter(ch)) sb.append(ch);
        //     else sb.append(" ");
        // }
       
        // return sb.toString();

        String words[] = s.split(" ");
        String[] arr = new String[words.length];
        for (String ch : words) {
            int i = ch.charAt(ch.length() - 1) - '1';  
            arr[i] = ch.substring(0, ch.length() - 1);
        }
        String str = "";
        for (String ch : arr) {
            str += ch + " ";
        }
        return str.trim(); 
    }
}
