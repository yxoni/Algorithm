import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> map = new HashMap<>();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int n = Integer.parseInt(st.nextToken());
            if (!map.containsKey(n)) {
                map.put(n, s);
            }
            arr[i] = n;
        }

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(br.readLine());

            int left = 0;
            int right = N - 1;
            int mid = 0;

            while (right != left) {
                mid = (left + right) / 2;

                if (target > arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            sb.append(map.get(arr[right])).append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}