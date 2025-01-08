import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        int[] dp = new int[6];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[i][0] = A;
            arr[i][1] = B;
        }

        for (int i = 1; i <= 5; i++) {
            int sequence = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][0] == i || arr[j][1] == i) {
                    sequence++;
                } else {
                    dp[i] = Math.max(dp[i], sequence);
                    sequence = 0;
                }
            }
            dp[i] = Math.max(dp[i], sequence);
        }

        int max = Arrays.stream(dp)
                .max()
                .orElse(0);
        int grade = 0;
        for (int i = 1; i <= 5; i++) {
            if (dp[i] == max) {
                grade = i;
                break;
            }
        }

        sb.append(max)
                .append(" ")
                .append(grade);
        System.out.println(sb);
    }
}