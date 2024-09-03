import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int result = -1;
        int temp = 0;
        
        while (n-temp > 0) {
            if (n%5 == 0) {
                result = n/5;
                break;
            } else if ((((n-temp)%5)+temp)%3 == 0 ) {
                result = ((n-temp)/5) + ((((n-temp)%5)+temp)/3);
                break;
            }
            temp += 5;
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        
    }
}