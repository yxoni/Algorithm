import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] temp;
    static StringBuilder sb;
    static Set<String> result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        temp = new int[M];
        result = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        backTracking(0, 0);
        sb = new StringBuilder();
        result.forEach(s -> sb.append(s).append(System.lineSeparator()));
        System.out.println(sb);
    }

    public static void backTracking(int cnt, int start) {
        if (cnt == M) {
            sb = new StringBuilder();
            Arrays.stream(temp)
                    .forEach(i -> sb.append(i).append(" "));
            result.add(sb.toString().trim());
            return;
        }

        for (int i = start; i < N; i++) {
            temp[cnt] = arr[i];
            backTracking(cnt + 1, i);
        }
    }
}