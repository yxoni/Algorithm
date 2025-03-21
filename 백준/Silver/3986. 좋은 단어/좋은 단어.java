import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  private static final int SIZE = 10001;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    int cnt = 0;
    
    for (int i = 0; i < N; i++) {
      String[] str = br.readLine().split("");
      Stack<String> stack = new Stack<>();
      
      stack.push(str[0]);
      for (int j = 1; j < str.length; j++) {
        if (!stack.isEmpty() && stack.peek().equals(str[j])) {
          stack.pop();
        } else {
          stack.push(str[j]);
        }
      }
      if (stack.isEmpty()) {
        cnt++;
      }
    }

    sb.append(cnt);
    System.out.println(sb);
  }
}