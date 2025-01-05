import java.io.*;
import java.util.*;

public class Main {
    private static ArrayList<Integer> list[];
    private static int[] distance;
    private static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];
        distance = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        bfs(N);

        int max = Arrays.stream(distance).max().orElse(0);
        int hide = 0;
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (distance[i] == max) {
                cnt++;
                if (hide == 0) {
                    hide = i;
                }
            }
        }

        sb.append(hide)
                .append(" ")
                .append(max)
                .append(" ")
                .append(cnt);
        System.out.println(sb);
    }

    public static void bfs(int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int peek = queue.poll();

            for (Integer i : list[peek]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    distance[i] = distance[peek] + 1;
                }
            }
        }
    }
}