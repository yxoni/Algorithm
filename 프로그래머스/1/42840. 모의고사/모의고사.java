import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] result = new int[3];
        Queue<Integer> one = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        Queue<Integer> two = new LinkedList<>(List.of(2, 1, 2, 3, 2, 4, 2, 5));
        Queue<Integer> three = new LinkedList<>(List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));
        
        int temp;
        for (int ans : answers) {
            if ((temp = one.poll()) == ans) {
                result[0]++;
            }
            one.offer(temp);
            
            if ((temp = two.poll()) == ans) {
                result[1]++;
            }
            two.offer(temp);
            
            if ((temp = three.poll()) == ans) {
                result[2]++;
            }
            three.offer(temp);
        }
        int max = Arrays.stream(result).max().orElse(0);
        int count = (int) Arrays.stream(result).filter(i -> i == max).count();

        int[] answer = new int[count];
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            if (result[i] == max) {
                answer[idx] = i + 1;
                idx++;
            }
        }
        
        return answer;
    }
}