import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;
    static int[] result;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        arr = new int[N];
        result = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        backTracking(0);
        System.out.println(sb);
    }

    public static void backTracking(int cnt) {
        if (cnt == M) {
            for (Integer i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i ++) {
            if (!visited[i]) {
                visited[i] = true;
                result[cnt] = arr[i];
                backTracking(cnt + 1);
                visited[i] = false;
            }
        }
    }
}