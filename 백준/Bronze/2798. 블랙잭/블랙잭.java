import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] card = new int[n]; 
        for(int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum;
        int result = 0;
        for(int i=0; i < n-2; i++) { 
            for(int j=i+1; j < n-1; j++) {   
                for(int k=j+1; k < n; k++) {
                    sum = 0;
                    sum += card[i];
                    sum += card[j];
                    sum += card[k];
                    if (sum == m) {
                        result = sum;
                        break;
                    } else if (sum > m) {
                        continue;
                    } else if (sum > result) {
                        result = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}