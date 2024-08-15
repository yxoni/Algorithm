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
        
        int r = 31;
        int m = 1234567891;
        long sum = 0;
        long mod = 1;
        for(int i=0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sum += (((int)((s.charAt(i) - 'a'))+1) * mod);
            mod = (r * mod) % m;
        }
        bw.write(String.valueOf(sum % m));
        bw.flush();
        bw.close();
    }
}