import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N + 1];
        dp[1] = 1;

        if (N != 1) {
            dp[2] = 1;
            for (int i = 3; i <= N; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
    }
}