import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
     arr[i] = Integer.parseInt(st.nextToken());
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {

      int sum = 0;
      if (K + i > N) {
        break;
      }

      for (int j = i; j < K + i; j++) {
        sum += arr[j];
      }

      max = Math.max(max, sum);
    }

    sb.append(max);
    System.out.println(sb);
  }
}