import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int result = 1;
        int layer = 2;
        int i = 0;
        while(num != 1) {
            layer += 6*i;
            if (num >= layer && num <= layer + 5 + 6*i) {
                result = i+2;
                break;
            }
            i++;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}