import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        List<Integer> answer = new ArrayList<>();
        int min = Arrays.stream(arr).min().orElse(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            
            answer.add(arr[i]);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}