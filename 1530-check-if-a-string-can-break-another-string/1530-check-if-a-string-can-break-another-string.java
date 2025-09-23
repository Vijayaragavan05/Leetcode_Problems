class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean a = true;
        boolean b = true;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]<ch2[i]) a = false;
            if(ch1[i]>ch2[i]) b = false;
        }
        return a||b;
    }
}