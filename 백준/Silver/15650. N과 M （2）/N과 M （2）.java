import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new int[M];
        bt(0);
    }

    public static void bt(int cnt) {
        if (cnt == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (cnt > 0 && arr[cnt-1] > i) continue;
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = i;
                bt(cnt+1);
                visited[i] = false;
            }
        }

    }

}