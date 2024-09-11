import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long left = 0;
        long right = 0;
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }
        right++;

        long mid;
        int result;
        while (left < right) {
            mid = (left + right) / 2;
            result = 0;
            for (int i = 0; i < K; i++) {
                result += arr[i] / mid;
            }
            if (result < N) {
                right = mid;
            } else if (result >= N) {
                left = mid + 1;
            }
        }
        bw.write(String.valueOf(left-1));
        bw.flush();
        bw.close();

    }
}