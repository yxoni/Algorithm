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
        int result = 0;
        
        for (int i = 0; i < num; i++) {
            String numStr = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < numStr.length(); j++) {
                char numChar = numStr.charAt(j);
                int digit = Character.getNumericValue(numChar);
                sum += digit;
            }
            sum += i;
            if (sum == num) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}