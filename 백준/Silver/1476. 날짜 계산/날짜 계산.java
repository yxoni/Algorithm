import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (S == 28) S = 0;
        if (M == 19) M = 0;

        int i = 0;
        int num;
        while (true) {
            num = 15 * i + E;
            if (num % 28 == S && num % 19 == M) break;
            i++;
        }

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();

    }
}