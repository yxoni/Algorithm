import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[N+1];

        int cnt = 0;
        for (int i = 2; i <= N; i++) {
            if (!visited[i]) {
                for (int j = i; j <= N; j += i) {
                    if (!visited[j]) {
                        visited[j] = true;
                        cnt++;

                        if (cnt == K) {
                            sb.append(j);
                        }
                    }
                }
            }
        }

        System.out.println(sb);
    }
}