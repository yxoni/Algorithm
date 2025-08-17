import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      max = Math.max(arr[i], max);
    }
    int M = Integer.parseInt(br.readLine());

    long left = 0;
    long right = max;
    while (left < right) {
      long mid = (left + right + 1) / 2;

      long num = 0;
      for (int i : arr) {
        num += Math.min(mid, i);
      }

      if (num <= M) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }

    sb.append(left);
    System.out.println(sb);
  }
}
