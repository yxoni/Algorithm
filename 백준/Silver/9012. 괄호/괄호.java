import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        boolean flag;
        Stack<Character> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            str = br.readLine();
            flag = true;
            for(char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty() && flag) bw.write("YES\n");
            else bw.write("NO\n");
            stack.clear();
        }
        bw.flush();
        bw.close();

    }
}