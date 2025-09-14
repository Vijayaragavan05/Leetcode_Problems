class Solution {
    public boolean isFascinating(int n) {
        String num = "" + n + 2*n + 3*n;
        if(num.length() != 9)   return false;
        boolean[] seen = new boolean[10];
        for(char ch : num.toCharArray()){
            int d = ch - '0';
            if(d==0 || seen[d]==true)   return false;
            seen[d] = true;
        }
        return true;
    }
}