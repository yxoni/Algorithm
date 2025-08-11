import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();

    int b = 1;
    boolean flag = false;
    for (int i = 0; i < N; i++) {
      if (str.charAt(i) == 'B') {
        flag = true;
      }

      if (flag && str.charAt(i) == 'R') {
        flag = false;
        b++;
      }
    }
    if (flag) {
      flag = false;
      b++;
    }

    int r = 1;
    for (int i = 0; i < N; i++) {
      if (str.charAt(i) == 'R') {
        flag = true;
      }

      if (flag && str.charAt(i) == 'B') {
        flag = false;
        r++;
      }
    }
    if (flag) {
      r++;
    }

    sb.append(Math.min(b, r));
    System.out.println(sb);
  }
}