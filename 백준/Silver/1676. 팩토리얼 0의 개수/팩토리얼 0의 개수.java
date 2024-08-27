import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int two = 0;
        int five = 0;
        int temp;
        for(int i = 1; i < n+1; i++) {
            temp = i;
            while(temp%2 == 0) {
                two++;
                temp /= 2;
            }
            while(temp%5 == 0) {
                five++;
                temp /=5;
            }
        }

        int result = two-five;
        if (two != 0 && five != 0) {
            if(result > 0) {
                bw.write(String.valueOf(five));
            } else {
                bw.write(String.valueOf(two));
            }
        } else {
            bw.write(String.valueOf(0));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}