import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int[] arr;
    static String[] result;
    static Set<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        result = new String[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        backTracking(0);
        for (String str: set) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }

    public static void backTracking(int cnt) {
        if (cnt == M) {
            String str = String.join(" ", result);
            set.add(str);
            return;
        }

        for (int i = 0; i < N; i++) {
            result[cnt] = String.valueOf(arr[i]);
            backTracking(cnt + 1);
        }
    }
}