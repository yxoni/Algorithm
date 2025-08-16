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
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int X = Integer.parseInt(br.readLine());

    double sum = 0;
    int num = 0;
    for (int i = 0; i < N; i++) {
      if (gcd(Math.max(X, arr[i]), Math.min(X, arr[i])) == 1) {
        sum += arr[i];
        num++;
      }
    }

    sb.append(sum / num);
    System.out.println(sb);
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
