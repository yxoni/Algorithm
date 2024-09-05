import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        int num;
        int result = 0;
        
        for(int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) stack.pop();
            else stack.push(num);
        }
        
        while(!(stack.isEmpty())) {
            result += stack.pop();
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        
    }
}