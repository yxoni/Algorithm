import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int width = 0;
        int length = 0;
        for (int[] arr : sizes) {
            width = Math.max(width, Math.max(arr[0], arr[1]));
            length = Math.max(length, Math.min(arr[0], arr[1]));
        }
        
        answer = width * length;
        return answer;
    }
}