import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static boolean isNumberic(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = new String[3];
        for(int i=0; i < 3; i++) {
            str[i] = br.readLine();
        }
        
        int i;
        for(i=0; i < 3; i++) {
            if(isNumberic(str[i])) {
                break;
            }
        }
        
        int num = 0;
        switch (i) {
            case 0:
                num = Integer.parseInt(str[0])+3;
                break;
            case 1:
                num = Integer.parseInt(str[1])+2;
                break;
            case 2:
                num = Integer.parseInt(str[2])+1;
                break;
            default:
                break;
        }
        
        if (num%3==0 && num%5==0) {
            bw.write("FizzBuzz");
        } else if (num%3==0) {
            bw.write("Fizz");
        } else if (num%5==0) {
            bw.write("Buzz");
        } else {
            bw.write(String.valueOf(num));
        }
        bw.flush();
        bw.close();
    }
}