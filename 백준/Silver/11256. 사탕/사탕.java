import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int J = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            List<Integer> box = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                box.add(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
            }
            box.sort(Collections.reverseOrder());

            int cnt = 0;
            for (Integer size : box) {
                if (J < 1) {
                    break;
                }

                J -= size;
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}