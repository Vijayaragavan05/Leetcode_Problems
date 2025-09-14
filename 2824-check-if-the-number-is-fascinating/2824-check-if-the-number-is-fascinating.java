class Solution {
    public boolean isFascinating(int n) {
        String s = ""+n+(2*n)+(3*n);
        if(s.length()!=9){
            return false;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            int dig = s.charAt(i)-'0';
            if(dig ==0 || hs.contains(dig)) return false;
            hs.add(dig);
        }
        return true;
    }
}