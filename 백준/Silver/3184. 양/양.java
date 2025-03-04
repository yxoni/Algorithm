import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    private static String[][] arr;
    private static boolean[][] visited;

    private static int N;
    private static int M;
    private static int sheep;
    private static int wolf;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new String[N][M];
        visited = new boolean[N][M];
        sheep = 0;
        wolf = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
                if (arr[i][j].equals("#")) {
                    visited[i][j] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    bfs(i, j);
                }
            }
        }

        sb.append(sheep).append(" ").append(wolf);
        System.out.println(sb);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        int s = 0;
        int w = 0;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            if (arr[now[0]][now[1]].equals("o")) {
                s++;
            } else if (arr[now[0]][now[1]].equals("v")) {
                w++;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }

        if (s > w) {
            sheep += s;
        } else {
            wolf += w;
        }
    }
}