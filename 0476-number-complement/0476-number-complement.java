class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i,'1');
            }
            else{
                sb.setCharAt(i,'0');
            }
        }
        String str = sb.toString();
        int n = Integer.parseInt(str,2);
    return n;
    }
}