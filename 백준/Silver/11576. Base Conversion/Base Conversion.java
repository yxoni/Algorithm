import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int num = 0;
        for (int i = m-1; i >= 0; i--) {
            num += Integer.parseInt(st.nextToken()) * Math.pow(A, i);
        }
        while (num != 0) {
            stack.push(num%B);
            num /= B;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb);

    }
}