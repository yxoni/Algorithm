import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                while(!stack.isEmpty()) bw.write(stack.pop());
                flag = true;
            }
            else if (str.charAt(i) == '>') {
                flag = false;
                bw.write(">");
                continue;
            }

            if (flag) bw.write(str.charAt(i));
            else if (str.charAt(i) == ' ') {
                while(!stack.isEmpty()) bw.write(stack.pop());
                bw.write(" ");
            }
            else stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()) bw.write(stack.pop());

        bw.flush();
        bw.close();
    }
}