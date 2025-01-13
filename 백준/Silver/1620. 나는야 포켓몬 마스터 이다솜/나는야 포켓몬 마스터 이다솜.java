import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> num = new HashMap<>();
        Map<String, Integer> alpha = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            num.put(i, input);
            alpha.put(input, i);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            try {
                sb.append(num.get(Integer.parseInt(input))).append("\n");
            } catch (NumberFormatException e) {
                sb.append(alpha.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }
}