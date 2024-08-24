import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int temp = 666;
        for (int i = 0; i < n; i++) {
            while(!(String.valueOf(temp).contains("666"))) {
                temp++;
            }
            num[i] = temp++;
        }
        bw.write(String.valueOf(num[n - 1]));

        bw.flush();
        bw.close();
    }
}