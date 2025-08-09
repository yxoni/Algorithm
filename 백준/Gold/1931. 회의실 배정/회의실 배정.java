import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][2];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, (i1, i2) -> {
      if (i1[1] == i2[1]) {
        return i1[0] - i2[0];
      }
      return i1[1] - i2[1];
    });

    int idx = 0;
    int result = 1;
    for (int i = 1; i < N; i++) {
      if (arr[i][0] >= arr[idx][1]) {
        idx = i;
        result++;
      }
    }

    sb.append(result);
    System.out.println(sb);
  }
}