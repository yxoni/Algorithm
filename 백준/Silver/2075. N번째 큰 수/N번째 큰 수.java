import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
        }
        
        for (int i = 0; i < N - 1; i++) {
            queue.poll();
        }
        sb.append(queue.peek());
        System.out.println(sb);
    }
}