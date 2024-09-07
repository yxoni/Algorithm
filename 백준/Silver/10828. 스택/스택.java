import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String command;
        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            
            switch (command) {
                case "push" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if (!(stack.empty())) bw.write(String.valueOf(stack.pop())+"\n");
                    else bw.write("-1\n");
                    break;
                case "size" :
                    bw.write(String.valueOf(stack.size())+"\n");
                    break;
                case "empty" :
                    if (!(stack.empty())) bw.write("0\n");
                    else bw.write("1\n");
                    break;
                case "top" :
                    if (!(stack.empty())) bw.write(String.valueOf(stack.peek())+"\n");
                    else bw.write("-1\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
                                                   
 
    }
}
