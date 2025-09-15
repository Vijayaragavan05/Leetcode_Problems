class Solution {
    public int canBeTypedWords(String text, String b) {
        int count=0;
        String word[] = text.split(" ");
        //String let[] = b.split(" ");
        for(String s : word){
            boolean c = true;
            for(char ch : b.toCharArray()){
                if(s.indexOf(ch)!=-1){
                    c = false;
                    break;
                }
            }
             if(c) count++;
        }
        return count;
    }
}