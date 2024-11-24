import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;
    static int[] temp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        arr = new int[N];
        temp = new int[M];

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
            StringBuilder str = new StringBuilder();
            for (Integer i : temp) {
                str.append(i).append(" ");
            }

            if (sb.indexOf(String.valueOf(str)) == -1) {
                sb.append(str).append("\n");
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[cnt] = arr[i];
                backTracking(cnt + 1);
                visited[i] = false;
            }
        }
    }
}