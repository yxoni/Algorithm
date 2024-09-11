import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int num;
        int pointer = 1;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            if (num >= pointer) {
                while (num >= pointer) {
                    stack.push(pointer++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if ((!stack.isEmpty()) && (stack.pop() == num)) sb.append("-\n");
                else {
                    sb.setLength(0);
                    sb.append("NO");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}