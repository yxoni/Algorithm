import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    long[] arr = new long[n + 1];

    arr[0] = 1;
    for (int i = 1; i <= n; i++) {
      long num = 0;

      for (int j = 0; j < i; j++) {
        num += arr[j] * arr[i - j - 1];
      }

      arr[i] = num;
    }

    sb.append(arr[n]);
    System.out.println(sb);
  }
}
