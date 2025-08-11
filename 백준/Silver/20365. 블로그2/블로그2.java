import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();

    int b = 1;
    int r = 1;
    boolean bFlag = false;
    boolean rFlag = false;

    for (int i = 0; i < N; i++) {
      if (str.charAt(i) == 'B') {
        bFlag = true;
      }
      if (bFlag && str.charAt(i) == 'R') {
        bFlag = false;
        b++;
      }

      if (str.charAt(i) == 'R') {
        rFlag = true;
      }
      if (rFlag && str.charAt(i) == 'B') {
        rFlag = false;
        r++;
      }
    }

    if (bFlag) {
      b++;
    }
    if (rFlag) {
      r++;
    }

    sb.append(Math.min(b, r));
    System.out.println(sb);
  }
}