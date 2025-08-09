import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    arr = new int[N][M];
    visited = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      String[] strings = str.split("");

      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(strings[j]);
      }
    }

    int result = bfs();
    sb.append(result);
    System.out.println(result);
  }

  public static int bfs() {
    Queue<Graph> q = new LinkedList<>();
    q.offer(new Graph(0, 0, 1));
    int result = 0;

    while (!q.isEmpty()) {
      Graph graph = q.poll();
      int cnt = graph.cnt;
      visited[graph.x][graph.y] = true;
      if (graph.x == N - 1 && graph.y == M - 1) {
        result = graph.cnt;
      }

      for (int i = 0; i < 4; i++) {
        int nx = graph.x + dx[i];
        int ny = graph.y + dy[i];

        if (nx >= 0 && nx < N && ny >= 0 && ny < M && arr[nx][ny] == 1 && !visited[nx][ny]) {
          q.offer(new Graph(nx, ny, cnt + 1));
          visited[nx][ny] = true;
        }
      }
    }

    return result;
  }

  static class Graph {
    int x;
    int y;
    int cnt;

    public Graph(int x, int y, int cnt) {
      this.x = x;
      this.y = y;
      this.cnt = cnt;
    }
  }
}