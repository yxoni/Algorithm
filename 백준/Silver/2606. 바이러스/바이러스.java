import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int[][] graph;
    private static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        int connection = Integer.parseInt(br.readLine());

        graph = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];
        for (int i = 0; i < connection; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }
        
        int result = bfs(1);
        sb.append(result);
        System.out.println(sb);
    }

    public static int bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> virus = new HashSet<>();
        q.add(num);

        while (!q.isEmpty()) {
            int n = q.peek();

            for (int i = 1; i <= N; i++) {
                if (graph[n][i] == 1 && !visited[n][i]) {
                    q.add(i);
                    virus.add(i);
                    visited[n][i] = visited[i][n] = true;
                }
            }
            q.poll();
        }
        return virus.size();
    }
}