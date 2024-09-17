import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        Stack<Integer> stack = new Stack<>();

        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) s.push(Integer.parseInt(st.nextToken()));

        int n;
        sb.append("1-");
        stack.push(s.pop());
        while (!s.isEmpty()) {
            n = s.pop();
            while(!stack.isEmpty() && stack.peek() <= n) stack.pop();
            if(stack.isEmpty()) sb.append(" 1-");
            else sb.append(" ").append(new StringBuilder(String.valueOf(stack.peek())).reverse());
            stack.push(n);
        }
        System.out.println(sb.reverse());
    }
}