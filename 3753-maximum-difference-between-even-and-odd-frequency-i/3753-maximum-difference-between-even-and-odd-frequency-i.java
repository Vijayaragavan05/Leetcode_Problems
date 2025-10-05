class Solution {
    public int maxDifference(String s) {
        int ans[] = new int[26];
        int i=0,j=s.length();
        for(char c : s.toCharArray()){
            ans[c-'a']++;
        }
        for(int k=0;k<26;k++){
            if(ans[k]%2!=0){
                i=Math.max(i,ans[k]);
            }
            if(ans[k]%2==0 && ans[k]>0){
                j=Math.min(j,ans[k]);
            }
        }
        return i-j;
    }
}