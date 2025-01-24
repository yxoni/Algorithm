import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] comb = new boolean[N+1][N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            comb[a][b] = comb[b][a] = true;
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (comb[i][j]) {
                    continue;
                }
                for (int k = j + 1; k <= N; k++) {
                    if (!comb[i][k] && !comb[j][k]) {
                        cnt++;
                    }
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}