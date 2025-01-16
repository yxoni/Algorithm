import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int n = nums.length / 2;
        int kind = Arrays.stream(nums).distinct().toArray().length;

        if (n >= kind) {
            answer = kind;
        } else {
            answer = n;
        }
        
        return answer;
    }
}