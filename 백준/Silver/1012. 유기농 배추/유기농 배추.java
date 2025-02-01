import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int earthworm = 0;
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k);
                        earthworm++;
                    }
                }
            }
            sb.append(earthworm).append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N && arr[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}