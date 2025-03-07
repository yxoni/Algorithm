class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;

        for (char c : s.toCharArray()) {
            if (Character.toUpperCase(c) == 'P') {
                p++;
            } else if (Character.toUpperCase(c) == 'Y') {
                y++;
            }
        }

        return p == y;
    }
}