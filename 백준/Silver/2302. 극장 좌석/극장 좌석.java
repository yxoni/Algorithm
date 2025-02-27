import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int vip = Integer.parseInt(br.readLine());

        int[] dp = new int[41];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < N + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int result = 1;
        int start = 1;
        for (int i = 0; i < vip; i++) {
            int vipSeat = Integer.parseInt(br.readLine());
            if (vipSeat - start != 0) {
                result *= dp[vipSeat - start];
            }
            start = vipSeat + 1;
        }
        if (N + 1 - start != 0) {
            result *= dp[N + 1 - start];
        }

        sb.append(result);
        System.out.println(sb);
    }
}