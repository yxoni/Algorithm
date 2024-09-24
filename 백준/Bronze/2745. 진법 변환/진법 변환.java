import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = Character.isDigit(N.charAt(0)) ? N.charAt(0)-'0' : N.charAt(0) - 'A' + 10;
        for (int i = 1; i < N.length(); i++) {
            if (Character.isDigit(N.charAt(i))) result = result * B + (N.charAt(i) - '0');
            else result = result * B + (N.charAt(i) - 'A' + 10);
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}