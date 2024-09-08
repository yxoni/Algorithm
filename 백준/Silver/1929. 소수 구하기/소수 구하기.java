import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Boolean[] isPrime = new Boolean[N+1];

        for(int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(isPrime[i]) {
                for(int j = i*i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = M; i < isPrime.length; i++) {
            if(isPrime[i]) {
                bw.write(String.valueOf(i)+"\n");
            }
        }

        bw.flush();
        bw.close();
    }
}