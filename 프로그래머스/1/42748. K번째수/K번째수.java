import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for (int[] arr : commands) {
            int i = arr[0] - 1;
            int j = arr[1];
            int k = arr[2] - 1;
            
            int[] sortArr = Arrays.copyOfRange(array, i , j);
            Arrays.sort(sortArr);
            answer.add(sortArr[k]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}