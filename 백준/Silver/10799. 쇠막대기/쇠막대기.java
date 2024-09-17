import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        int open = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            } else {
                open--;

                if (str.charAt(i-1) == '(') {
                    result += open;
                } else
                    result += 1;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}