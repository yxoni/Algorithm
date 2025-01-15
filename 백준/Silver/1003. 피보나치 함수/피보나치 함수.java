import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = one[1] = 1;
        zero[1] = one[0] = 0;
        for (int i = 2; i <= 40; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        for (int i = 0; i < N; i++) {
            int idx = Integer.parseInt(br.readLine());
            sb.append(zero[idx])
                    .append(" ")
                    .append(one[idx])
                    .append("\n");
        }

        System.out.println(sb);
    }
}