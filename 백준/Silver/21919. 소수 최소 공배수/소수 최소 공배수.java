import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static final int SIZE = 1_000_001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[SIZE];
        visited[0] = visited[1] = true;
        for (int i = 2; i < Math.sqrt(SIZE); i++) {
            if (!visited[i]) {
                for (int j = i * i; j < SIZE; j += i) {
                    if (!visited[j]) {
                        visited[j] = true;
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (!visited[num]) {
                list.add(num);
            }
        }

        long result = -1L;
        if (list.size() != 0) {
            sb = new StringBuilder();
            Collections.sort(list);
            result = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                int num = list.get(i);
                if (result > num) {
                    result = result * num / gcd(result, num);
                } else {
                    result = num * result / gcd(num, result);
                }
            }
        }

        sb.append(result);
        System.out.println(sb);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}