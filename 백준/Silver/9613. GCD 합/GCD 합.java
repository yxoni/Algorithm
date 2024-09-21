import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        int n;
        int[] arr;
        long result = 0;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            result = 0;

            arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < n-1; j++) {
                for (int k = 0; k < n-j-1; k++) {
                    result += gcd(arr[j], arr[j+k+1]);
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}