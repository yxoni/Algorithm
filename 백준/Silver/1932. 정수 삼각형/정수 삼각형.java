import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[][] dp = new int[N][N];
    int[][] arr = new int[N][N];
    arr[0][0] = Integer.parseInt(br.readLine());
    dp[0][0] = arr[0][0];

    for (int i = 1; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j <= i; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int max = dp[0][0];
    for (int i = 1; i < N; i++) {
      for (int j = 0; j <= i; j++) {
        if (j - 1 < 0) {
          dp[i][j] = arr[i][j] + dp[i - 1][j];
        } else if (j > i - 1) {
          dp[i][j] = arr[i][j] + dp[i - 1][j - 1];
        } else {
          dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
        }

        if (i == N - 1) {
          max = Math.max(max, dp[i][j]);
        }
      }
    }

    sb.append(max);
    System.out.println(sb);
  }
}