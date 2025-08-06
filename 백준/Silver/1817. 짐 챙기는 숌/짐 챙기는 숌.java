import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Queue<Integer> queue = new LinkedList<>();

    if (N > 0) {
      st = new StringTokenizer(br.readLine());
    }
    for (int i = 0; i < N; i++) {
      queue.add(Integer.parseInt(st.nextToken()));
    }

    int result = 0;
    while (!queue.isEmpty()) {
      int weight = 0;

      while (!queue.isEmpty() && queue.peek() <= M - weight) {
        weight += queue.poll();
      }

      result++;
    }

    sb.append(result);
    System.out.println(sb);
  }
}