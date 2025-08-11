class Solution {
    public int countConsistentStrings(String a, String[] words) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<a.length();i++){
            set.add(a.charAt(i));
        }
        int count=0;
        for(String s : words){
            int flag =1;
            for(int i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i))){
                    flag=0;
                    break;
                }
            }
            count+=flag;
        }
        return count;
    }
}