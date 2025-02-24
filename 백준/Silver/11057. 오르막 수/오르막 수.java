import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][10];
        Arrays.fill(dp[0], 1);

        for (int i = 1; i < N; i++) {
            dp[i][0] = 1;
            int sum = 1;
            for (int j = 1; j < 10; j++) {
                sum = (sum + dp[i - 1][j]) % 10007;
                dp[i][j] = sum;
            }
        }
        int result = Arrays.stream(dp[N-1]).sum();

        sb.append(result % 10007);
        System.out.println(sb);
    }
}