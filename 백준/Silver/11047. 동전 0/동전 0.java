import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> coin = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            coin.add(Integer.parseInt(br.readLine()));
        }
        Collections.reverse(coin);

        int cnt = 0;
        int remainder = K;
        for (Integer i : coin) {
            if (remainder == 0) {
                break;
            }
            if (i <= remainder) {
                cnt += remainder / i;
                remainder = remainder % i;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}