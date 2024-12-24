import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[100001];
        dp[0] = 0;
        dp[1] = 3;
        dp[2] = 7;

        for (int i = 3; i < N+1; i++) {
            dp[i] = (dp[i-1] + dp[i-1] + dp[i-2]) % 9901;
        }
        sb.append(dp[N]);
        System.out.println(sb);
    }

}