import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        long peek = x;
        for (int i = 0; i < n; i++) {
            answer.add(peek);
            peek += x;
        }
        return answer.stream().mapToLong(Long::longValue).toArray();
    }
}