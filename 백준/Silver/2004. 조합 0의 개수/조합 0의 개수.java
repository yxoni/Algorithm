import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int five(int n) {
        int count = 0;
        while (n >= 5) {
            count += n/5;
            n /= 5;
        }
        return count;
    }

    public static int two(int n) {
        int count = 0;
        while (n >= 2) {
            count += n/2;
            n /= 2;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int five = five(N) - five(M) - five(N - M);
        int two = two(N) - two(M) - two(N - M);

        bw.write(String.valueOf(Math.min(five, two)));

        bw.flush();
        bw.close();
    }

}