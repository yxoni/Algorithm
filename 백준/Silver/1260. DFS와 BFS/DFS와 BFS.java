import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static boolean[] visited;
    static int[][] graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] =1;
        }

        dfs(V);
        sb.append("\n");
        Arrays.fill(visited, false);
        bfs(V);

        System.out.println(sb);
    }

    public static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");
        for (int i = 0; i <= N; i++) {
            if (graph[v][i] == 1 && !visited[i]) dfs(i);
        }
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            sb.append(temp).append(" ");

            for (int i = 1; i <= N; i++) {
                if(graph[temp][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}