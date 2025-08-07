import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] arr = new int[10_000_001];

        for (int i : tangerine) {
            arr[i]++;
        }

        List<Integer> list = Arrays.stream(arr)
            .boxed()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());

        int count = 0;
        while (count < k) {
            count += list.get(answer);
            answer++;
        }

        return answer;
    }
}