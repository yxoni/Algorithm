import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        queue.add(arr[0]);

        int num = queue.peek();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != num) {
                queue.add(arr[i]);
                num = arr[i];
            }
        }

        answer = queue.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}