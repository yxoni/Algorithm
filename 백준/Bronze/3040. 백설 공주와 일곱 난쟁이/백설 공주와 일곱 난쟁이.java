import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = 9;
    int[] arr = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      sum += arr[i];
    }

    boolean flag = false;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (arr[i] + arr[j] == sum - 100) {
          arr[i] = arr[j] = 0;
          flag = true;
          break;
        }
      }

      if (flag) {
        break;
      }
    }

    for (int i : arr) {
      if (i == 0) continue;

      sb.append(i).append(System.lineSeparator());
    }
    System.out.println(sb);
  }
}
