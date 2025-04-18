import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int result = 0;

      for (int b = n - 1; b > 0; b--) {
        for (int a = b - 1; a > 0; a--) {
          double number = (Math.pow(a, 2) + Math.pow(b, 2) + m) / (a * b);
          if (number == (double) (int) number) {
            result++;
          }
        }
      }

      sb.append(result).append(System.lineSeparator());
    }
    System.out.println(sb);
  }
}