import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int A;
        int B;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if (A>B) bw.write(String.valueOf(A*B/gcd(A, B))+"\n");
            else bw.write(String.valueOf(A*B/gcd(B, A))+"\n");
        }
        bw.flush();
        bw.close();
    }
}