import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String token;
        
        while ((token = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(token, " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
             if (a == 0) {
                break;
            } 
            
            int[] num = {a, b, c};
            java.util.Arrays.sort(num);
            
           if (num[0]*num[0] + num[1]*num[1] == num[2]*num[2]) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }      
            bw.newLine();
        }
        bw.flush();     
    }
}
   