import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int idx = 0;
        for (String[] strings : photo) {
            int result = 0;
            for (String string : strings) {
                if (map.containsKey(string)) {
                    result += map.get(string);
                }
            }
            answer[idx++] = result;
        }
        return answer;
    }
}
