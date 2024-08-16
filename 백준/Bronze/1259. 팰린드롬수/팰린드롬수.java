import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        String n;
        int sum;
        while(!((n = br.readLine()).equals("0"))) {
            sum = 0;
            char[] ch = n.toCharArray();
            int len = ch.length;
            for(int i = 0; i < len/2; i++) {
               if (ch[i] == ch[len-1-i]) {
                   sum++;
                } else {
                   bw.write("no\n");
                   break;
               }     
            }
            if (sum == len/2) {
                   bw.write("yes\n");
            }
        }
        bw.flush();
        bw.close();
    }
}