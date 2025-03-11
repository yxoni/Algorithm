import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (Integer i : map.keySet()) {
            if (M - i != i && map.containsKey(M - i) && map.get(M - i) > 0) {
                map.put(i, map.get(i) - 1);
                map.put(M - i, map.get(M - i) - 1);
                result++;
            } else if (M - i == i && map.get(i) > 1) {
                map.put(i, map.get(i) - 2);
                result++;
            }
        }

        sb.append(result);
        System.out.println(sb);
    }
}