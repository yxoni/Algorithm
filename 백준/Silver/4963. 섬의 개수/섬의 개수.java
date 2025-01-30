import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int h;
    private static int w;
    private static int arr[][];
    private static boolean visited[][];
    private static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
    private static int[] dy = {-1, 1, 0, 0, 1, 1, -1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while ((w = Integer.parseInt(st.nextToken())) != 0) {
            h = Integer.parseInt(st.nextToken());

            arr = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }

            sb.append(cnt).append(System.lineSeparator());
            st = new StringTokenizer(br.readLine());
        }
        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && nx < h && ny >= 0 && ny < w && !visited[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

}