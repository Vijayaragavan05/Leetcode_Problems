class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String s:words){
            //for(int i=0;i<s.length();i++){
                if(s.startsWith(pref)){
                    count++;
                }
            }
        //}
        return count;
    }
}