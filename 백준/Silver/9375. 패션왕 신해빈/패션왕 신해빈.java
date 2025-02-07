import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Map<String, Integer> clothes = new HashMap<>();

            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();

                clothes.put(type, clothes.getOrDefault(type, 1) + 1);
            }

            int cnt = 1;
            for (int val : clothes.values()) {
                cnt *= val;
            }

            sb.append(cnt - 1).append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}