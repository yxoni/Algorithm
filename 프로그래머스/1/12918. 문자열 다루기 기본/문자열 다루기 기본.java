class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return false;
            }
        }
        
        return true;
    }
}