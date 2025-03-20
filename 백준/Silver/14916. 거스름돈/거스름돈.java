import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    int cnt = N / 5;
    N %= 5;

    while (N != 0) {
      if (N % 2 != 0) {
        if (cnt == 0) {
          sb.append(-1);
          break;
        }
        cnt--;
        N += 5;
        continue;
      }

      cnt += N / 2;
      N %= 2;
    }

    if (N == 0) {
      sb.append(cnt);
    }

    System.out.println(sb);
  }
}