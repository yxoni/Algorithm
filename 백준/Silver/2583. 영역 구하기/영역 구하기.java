import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int M;
    private static boolean[][] paper;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    public static class Rectangle {
        int x;
        int y;

        public Rectangle(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        paper = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    paper[j][k] = true;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!paper[i][j]) {
                    result.add(dfs(i, j));
                }
            }
        }

        Collections.sort(result);
        sb.append(result.size()).append(System.lineSeparator());
        result.forEach(i -> sb.append(i).append(" "));
        System.out.println(sb);
    }

    public static int dfs(int x, int y) {
        Queue<Rectangle> queue = new LinkedList<>();
        queue.offer(new Rectangle(x, y));
        paper[x][y] = true;

        int cnt = 0;
        while (!queue.isEmpty()) {
            Rectangle rectangle = queue.poll();
            cnt++;

            for (int i = 0; i < 4; i++) {
                int nx = rectangle.x + dx[i];
                int ny = rectangle.y + dy[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && !paper[nx][ny]) {
                    queue.offer(new Rectangle(nx, ny));
                    paper[nx][ny] = true;
                }
            }
        }

        return cnt;
    }
}