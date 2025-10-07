class Solution {
    public int numberOfAlternatingGroups(int[] c) {
        int count=0;
        int n = c.length;
        if(n<3) return count;
        for(int i=0;i<n-2;i++){
            if(c[i]==c[i+2] && c[i]!=c[i+1]){
                count++;
            }
        }
        if(c[0]==c[n-2] && c[n-1]!=c[0]){
            count++;
        }
        if(c[n-1]==c[1] && c[0]!=c[n-1]){
            count++;
        }
        return count;
    }
}