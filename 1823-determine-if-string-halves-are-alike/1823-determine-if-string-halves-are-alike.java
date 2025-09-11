class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'));
        int n = s.length();
        int c=0,c1=0;
        for(int i=0;i<n/2;i++){
            if(set.contains(s.charAt(i))) c++;
        }
        for(int i=n/2;i<n;i++){
            if(set.contains(s.charAt(i))) c1++;
        }
        return c==c1;
    }
}