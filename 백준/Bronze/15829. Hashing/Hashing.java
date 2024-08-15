import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int sum = 0;
        for(int i=0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num = ch - 'a' + 1;
            sum += num * Math.pow(31, i);
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}