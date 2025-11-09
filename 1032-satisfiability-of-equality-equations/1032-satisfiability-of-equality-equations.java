class Solution {
    int p[] = new int[26];
    public boolean equationsPossible(String[] eq) {
       for(int i=0;i<26;i++){
            p[i]=i;
       }
       for(String s : eq){
            if(s.charAt(1)=='='){
                int ch1 = find(s.charAt(0)-'a');
                int ch2 = find(s.charAt(3)-'a');
                p[ch1] = ch2; 
            }
       }
        for(String s : eq){
            int ch1 = find(s.charAt(0)-'a');
            int ch2 = find(s.charAt(3)-'a');
            if(s.charAt(1)=='!' && find(ch1) == ch2){
                 return false;
            }
        }
        return true;
    }
    public int find(int x){
        if(p[x]==x) return x;
        return p[x]=find(p[x]);
    }
}