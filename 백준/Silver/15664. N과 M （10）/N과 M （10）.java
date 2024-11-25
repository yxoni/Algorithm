import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;
    static int[] result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
            String str = "";
            for (Integer i : result) {
                str += (i + " ");
            }

            if (sb.indexOf(str) == -1) {
                sb.append(str).append("\n");
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (cnt > 0 && result[cnt-1] > arr[i]) {
                continue;
            }
            if (!visited[i]) {
                visited[i] = true;
                result[cnt] = arr[i];
                backTracking(cnt + 1);
                visited[i] = false;
            }
        }
    }
}