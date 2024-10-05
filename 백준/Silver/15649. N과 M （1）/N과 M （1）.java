import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb;
    static int N;
    static int M;
    static boolean[] check;

    public static void backTracking(String str, int count) {
        if (count == M) {
            sb.append(str).append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if(check[i]) {
                check[i] = false;
                backTracking(str + i + " ", count+1);
                check[i] = true;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        check = new boolean[N + 1];
        Arrays.fill(check, true);

        backTracking("", 0);

        System.out.println(sb);
    }
}