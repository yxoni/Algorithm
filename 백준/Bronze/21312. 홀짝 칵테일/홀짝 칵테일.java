import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            result.add(arr[i]);
            for (int j = i + 1; j < 3; j++) {
                result.add(arr[i] * arr[j]);
            }
        }
        result.add(arr[0] * arr[1] * arr[2]);

        result.sort(Collections.reverseOrder());
        int max = result.get(0);
        for (Integer i : result) {
            if (max < i) {
                if (!(max % 2 == 1 && i % 2 == 0)) {
                    max = i;
                }
            } else {
                if (max % 2 == 0 && i % 2 == 1) {
                    max = i;
                }
            }
        }
        sb.append(max);
        System.out.println(sb);
    }
}