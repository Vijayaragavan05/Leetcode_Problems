class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        int Vow = 0;
        int Con = 0;
        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (isVowel(lower)) {
                    Vow++;
                } else {
                    Con++;
                }
            }
        }
        if (Vow == 0 || Con == 0) return false;
        return true;
    }
    private boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}