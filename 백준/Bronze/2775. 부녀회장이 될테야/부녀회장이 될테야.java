import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static int calc(int k, int n) {
        int[][] f = new int[k][n];

        for(int i = 0; i < k; i++) {
            if (i == 0) {
                for(int j = 0; j < n; j++) {
                    f[i][j] = j+1;
                }
            } else {
                for(int j = 0; j < n; j++) {
                    for(int h = 0; h < j+1; h++) {
                        f[i][j] += f[i-1][h];
                    }
                }
            }
        }
        return f[k-1][n-1];
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int k;
        int n;
        for(int i = 0; i < num; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(calc(k+1, n)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}