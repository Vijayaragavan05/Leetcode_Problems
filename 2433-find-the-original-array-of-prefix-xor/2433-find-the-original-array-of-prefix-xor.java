class Solution {
    public int[] findArray(int[] p) {
        int n = p.length;
        for(int i=n-1;i>0;i--){
            p[i]^=p[i-1];
        }
        return p;
    }
}