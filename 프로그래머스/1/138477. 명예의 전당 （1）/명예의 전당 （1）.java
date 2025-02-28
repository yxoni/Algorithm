import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i : score) {
            list.add(i);
            Collections.sort(list, Collections.reverseOrder());

            if (list.size() == k + 1) {
                list.remove(k);
            }
            answer.add(list.get(list.size() - 1));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}