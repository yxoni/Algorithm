import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];

    long max = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      max = Math.max(arr[i], max);
    }

    long left = 0;
    long right = max;
    while (left < right) {
      long mid = (left + right + 1) / 2;

      long tree = 0;
      for (int i = 0; i < N; i++) {
        if (arr[i] - mid > 0) {
          tree += arr[i] - mid;
        }
      }

      if (tree >= M) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }

    sb.append(left);
    System.out.println(sb);
  }
}