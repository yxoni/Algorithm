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
        int v = Integer.parseInt(st.nextToken());
        
        int day = 1;
        if (v-a > 0) {
            if ((v-a)/(a-b) == 0) {
                day++;
            } else if ((v-a)%(a-b) == 0) {
                day += (v-a)/(a-b);      
            } else {
                day += ((v-a)/(a-b) + 1);
            }
        }
   
        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}