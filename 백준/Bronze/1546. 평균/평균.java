import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] num = new double[n];
        double max = 0;
        for(int i = 0; i < n; i++) {
            num[i] = Double.parseDouble(st.nextToken());
            max = Math.max(max, num[i]);
        }
        double result = 0;
        double score;
        for(int i = 0; i < n; i++) {
            result += num[i]/max * 100;
        }
        bw.write(String.valueOf(result/n));
        bw.flush();
        bw.close();
    }
}