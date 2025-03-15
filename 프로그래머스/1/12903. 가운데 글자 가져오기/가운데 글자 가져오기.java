class Solution {
    public String solution(String s) {
        int len = s.length() / 2;
        if (s.length() % 2 == 1) {
            return s.substring(len, len + 1);
        }
        return s.substring(len - 1, len + 1);
    }
}