import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (arr[idx] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - arr[idx];
            }
            arr[idx] = i;
        }
        return answer;
    }
}
