import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            list.add(i+1);
        }

        int removeIdx = K-1;
        sb.append("<");
        for(int i = 0; i < N; i++) {
            if (list.size() == 1) break;
            sb.append(list.get(removeIdx) + ", ");
            list.remove(removeIdx--);
            for(int j = 0; j < K; j++) {
                removeIdx++;
                if(removeIdx == list.size()) removeIdx = 0;
            }
        }
        sb.append(list.get(0) + ">");
        System.out.println(sb);
    }
}