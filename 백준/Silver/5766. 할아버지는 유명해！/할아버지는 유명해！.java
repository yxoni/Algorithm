import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  private static final int SIZE = 10001;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      int[] arr = new int[SIZE];

      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      if (N == 0 && M == 0) {
        break;
      }

      for (int i = 0; i < N; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
          int n = Integer.parseInt(st.nextToken());
          arr[n]++;
        }
      }

      int[] sortedArr = Arrays.stream(arr).distinct()
          .sorted().toArray();
      int max = sortedArr[sortedArr.length - 2];


      for (int i = 0; i < SIZE; i++) {
        if (arr[i] == max) {
          sb.append(i).append(" ");
        }
      }
      sb.append(System.lineSeparator());
    }

    System.out.println(sb);
  }
}