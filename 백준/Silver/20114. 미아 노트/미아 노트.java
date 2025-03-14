import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());

    char[][] chars = new char[H][N * W];
    for (int i = 0; i < H; i++) {
      chars[i] = br.readLine().toCharArray();
    }

    String[] result = new String[N];
    Arrays.fill(result, "?");
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < H; j++) {
        for (int k = 0; k < W; k++) {
          if (chars[j][k + i * W] != '?') {
            result[i] = String.valueOf(chars[j][k + i * W]);
          }
        }
      }
    }
    sb.append(String.join("", result));
    System.out.println(sb);
  }
}