import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N+1];

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
            }

            int num = 1;
            int comp = arr[1];
            for (int j = 2; j < N+1; j++) {
                if (comp > arr[j]) {
                    comp = arr[j];
                    num++;
                }
            }
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}