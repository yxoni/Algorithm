import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new int[M];
        bt(0);
        System.out.println(sb);
    }

    public static void bt(int cnt) {
        if (cnt == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[cnt] = i;
            bt(cnt+1);
        }
    }
}