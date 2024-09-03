import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        char[] check = {'(', ')', '[', ']'};


        while (br.ready()) {
            for (char c : str.toCharArray()) {
                for (char ch : check) {
                    if (c == ch) {
                        if(!(stack.isEmpty())) {
                            if ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[')) {
                                stack.pop();
                            } else {
                                stack.push(c);
                            }
                        }
                         else {
                            stack.push(c);
                        }
                    }
                }
            }

            if (stack.isEmpty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
            stack.clear();
            str = br.readLine();

        }
        bw.flush();
        bw.close();
    }
}