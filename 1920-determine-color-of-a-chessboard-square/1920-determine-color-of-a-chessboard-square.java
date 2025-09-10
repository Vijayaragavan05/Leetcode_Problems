class Solution {
    public boolean squareIsWhite(String s) {
        return (s.charAt(0)%2)!=(s.charAt(1)%2);
    }
}