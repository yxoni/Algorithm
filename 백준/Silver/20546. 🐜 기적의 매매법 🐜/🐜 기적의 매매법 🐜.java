import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N = 14;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int money = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int bnp = 0;
        int temp = money;
        for (int i = 0; i < N; i++) {
            if (temp == 0) {
                break;
            }

            if (temp / arr[i] > 0) {
                bnp += temp / arr[i];
                temp = temp - (arr[i] * (temp / arr[i]));
            }
        }
        bnp = bnp * arr[13] + temp;

        int timing = 0;
        temp = money;
        int up = 0;
        int down = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] < arr[i]) {
                up++;
                down = 0;
            } else if (arr[i - 1] > arr[i]) {
                down++;
                up = 0;
            } else {
                down = 0;
                up = 0;
            }

            if (up == 3) {
                temp = temp + (timing * arr[i]);
                timing = 0;
                up = 0;
            } else if (down >= 3) {
                timing += temp / arr[i];
                temp = temp - (arr[i] * (temp / arr[i]));
            }
        }

        timing = timing * arr[13] + temp;
        sb.append(bnp > timing ? "BNP" : ( timing > bnp ? "TIMING" : "SAMESAME"));
        System.out.println(sb);
    }
}