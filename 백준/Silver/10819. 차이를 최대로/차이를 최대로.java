import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int[] arr;
    private static int[] result;
    private static boolean[] visited;
    private static List<Integer> temp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        result = new int[N];
        visited = new boolean[N];
        temp = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0);
        sb.append(temp.stream().max(Integer::compareTo).orElse(0));
        System.out.println(sb);
    }

    public static void backTracking(int cnt) {
        if (cnt == N) {
            int num = 0;
            for (int i = 0; i < N-1; i++) {
                num += Math.abs(result[i] - result[i+1]);
            }
            temp.add(num);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[cnt] = arr[i];
                backTracking(cnt+1);
                visited[i] = false;
            }
        }
    }
}