import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Queue<Integer> q;

        int n = Integer.parseInt(br.readLine());
        int N;
        int M;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            q = new LinkedList<>();
            int pointer = M;
            for (int j = 0; j < N; j++) {
                q.add(Integer.parseInt(st.nextToken()));
            }

            Boolean flag;
            int result = 0;
            while (pointer >= 0) {
                flag = true;
                for (Integer num : q) {
                    if (q.peek() < num) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result++;
                    q.remove();
                    pointer--;
                } else {
                    q.add(q.remove());
                    pointer--;
                    if (pointer == -1) pointer = q.size() - 1;
                }
            }
            bw.write(String.valueOf(result)+"\n");
        }
        bw.flush();
        bw.close();

    }
}