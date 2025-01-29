import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int A;
    private static int B;
    private static int N;
    private static int M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sb.append(bfs());
        System.out.println(sb);
    }

    public static int bfs() {
        int[] answer = new int[100001];
        boolean[] visited = new boolean[100001];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            int[] arr = {temp - 1, temp + 1, temp - A, temp + A, temp - B, temp + B, temp * A, temp * B};
            for (int i : arr) {
                if (i >= 0 && i <= 100000 && !visited[i]) {
                    visited[i] = true;
                    answer[i] = answer[temp] + 1;
                    queue.offer(i);
                }
            }
            if (answer[M] > 0) {
                break;
            }
        }
        return answer[M];
    }
}