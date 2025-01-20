import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 1999; i++) {
            int x = i - 999;
            for (int j = 0; j < 1999; j++) {
                int y = j - 999;
                if (a * x + b * y == c && d * x + e * y == f) {
                    sb.append(x).append(" ").append(y);
                }
            }
        }
        System.out.println(sb);
    }
}