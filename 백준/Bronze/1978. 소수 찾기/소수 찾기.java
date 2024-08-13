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
        int prime = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num != 1) {
                int k = num/2;
                int result = 0;
                for(int j = 1; j < k+1; j++) {
                    if(num%j==0) {
                        result++;
                    }
                }
                if (result == 1) {
                    prime++;
                }
            }    
        }
        bw.write(String.valueOf(prime));
        bw.flush();
        bw.close();
    }
}