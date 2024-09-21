import java.io.*;

public class Main {
    public static int factorial(int a) {
        if (a == 1) return a;
        return a * factorial(a-1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(N == 0 ? 1 : factorial(N)));
        bw.flush();
        bw.close();
    }
}