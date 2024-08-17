import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max = Math.max(a, b);
        int min = Math.min(a, b);


        int div = 1;
        int mul = 1;
        if (max%min == 0) {
            div = min;
            mul = max;
        } else {
            for(int i = min/2; i > 0; i--) {
                if (max%i == 0 && min%i == 0) {
                    div = i;
                    break;
                }
            }
            int temp = max/div;
            while(true) {
                temp++;
                mul = div*temp;
                if (mul%max == 0 && mul%min == 0) {
                    break;
                }
            }
        }
        bw.write(String.valueOf(div));
        bw.newLine();
        bw.write(String.valueOf(mul));
        bw.flush();
        bw.close();
    }
}