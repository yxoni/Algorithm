import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (B == 10)  {
            sb.append(N);
            System.out.println(sb);
        }
        else {
            while (N >= B) {
                if (N % B > 9) {
                    sb.append((char) ('A' + (N % B - 10)));
                } else sb.append(N % B);
                N /= B;
            }
            if (N > 9) sb.append((char) ('A' + (N - 10)));
            else sb.append(N);
            System.out.println(sb.reverse());
        }

    }
}