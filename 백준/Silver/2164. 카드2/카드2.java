import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i ++) {
            q.add(i + 1);
        };

        while (q.size() != 1) {
            q.remove();
            q.add(q.remove());
        }
        bw.write(String.valueOf(q.element()));
        bw.flush();
        bw.close();
    }
}