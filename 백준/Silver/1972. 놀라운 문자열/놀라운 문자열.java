import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine();
    while (!str.equals("*")) {
      boolean flag = true;

      for (int i = 1; i < str.length() - 1; i++) {
        List<String> arr = new ArrayList<>();
        for (int j = 0; j < str.length() - i; j++) {
          String s = str.charAt(j) + String.valueOf(str.charAt(j + i));
          if (arr.contains(s)) {
            flag = false;
          } else {
            arr.add(s);
          }
        }
      }

      if (flag) {
        sb.append(str).append(" is surprising.").append(System.lineSeparator());
      } else {
        sb.append(str).append(" is NOT surprising.").append(System.lineSeparator());
      }
      
      str = br.readLine();
    }
    
    System.out.println(sb);
  }
}