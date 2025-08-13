import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static int N;
  private static int M;
  private static int[][] arr;
  private static int[] dx = {0, 0, -1, -1, -1, 1, 1, 1};
  private static int[] dy = {-1, 1, 0, -1, 1, 0, -1, 1};
  private static Queue<int[]> q;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    arr = new int[N][M];
    q = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
        if (arr[i][j] == 1) {
          arr[i][j] = -1;
          q.offer(new int[]{i, j, 0});
        }
      }
    }

    bfs();
    int max = 0;
    for (int[] ints : arr) {
      for (int anInt : ints) {
        max = Math.max(max, anInt);
      }
    }

    sb.append(max);
    System.out.println(sb);
  }

  public static void bfs() {
    while (!q.isEmpty()) {
      int[] now = q.poll();

      for (int i = 0; i < 8; i++) {
        int nx = now[0] + dx[i];
        int ny = now[1] + dy[i];

        if (nx >= 0 && nx < N && ny >= 0 && ny < M && arr[nx][ny] != -1) {
          if (arr[nx][ny] == 0 || now[2] + 1 < arr[nx][ny]) {
            arr[nx][ny] = now[2] + 1;
            q.offer(new int[]{nx, ny, arr[nx][ny]});
          }
        }
      }
    }
  }
}