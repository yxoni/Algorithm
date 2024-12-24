import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("SAD");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> period = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += arr[i];
        }
        period.add(sum);

        for (int i = X; i < N; i++) {
            sum -= arr[i - X];
            sum += arr[i];
            period.add(sum);
        }

        int max = Collections.max(period);
        int result = 0;
        for (Integer i : period) {
            if (i == max) {
                result++;
            }
        }

        if (max > 0) {
            sb = new StringBuilder();
            sb.append(max)
                    .append(System.lineSeparator())
                    .append(result);
        }
        System.out.println(sb);


    }
}