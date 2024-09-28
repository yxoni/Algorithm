import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dp = new int[N + 1];
        for (int i = 1; i < N+1; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
            for (int j = 1; j < i/2+1; j++) {
                dp[i] = Math.max(dp[i], dp[j] + dp[i-j]);
            }
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
    }
}