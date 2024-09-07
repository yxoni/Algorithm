import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String command;
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<>();
        int back = 0;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            switch (command) {
                case "push" :
                    back = Integer.parseInt(st.nextToken());
                    queue.add(back);
                    break;
                case "pop" :
                    if (!(queue.isEmpty())) bw.write(String.valueOf(queue.poll())+"\n");
                    else bw.write("-1\n");
                    break;
                case "size" :
                    bw.write(String.valueOf(queue.size())+"\n");
                    break;
                case "empty" :
                    if (!(queue.isEmpty())) bw.write("0\n");
                    else bw.write("1\n");
                    break;
                case "front" :
                    if (!(queue.isEmpty())) bw.write(String.valueOf(queue.peek())+"\n");
                    else bw.write("-1\n");
                    break;
                case "back" :
                    if (!(queue.isEmpty())) bw.write(String.valueOf(back)+"\n");
                    else bw.write("-1\n");
                    break;
            }
        }
        bw.flush();
        bw.close();

    }
}