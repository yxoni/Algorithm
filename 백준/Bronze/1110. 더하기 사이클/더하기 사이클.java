import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int result = N;

        while (true) {
            cnt++;
            result = (result % 10) * 10 + (result / 10 + result % 10) % 10;

            if (result == N) {
                break;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}