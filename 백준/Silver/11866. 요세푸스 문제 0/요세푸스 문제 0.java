import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int removeIdx = K-1;
        ArrayList<Integer> arr = new ArrayList<>(N);

        for(int i = 0; i < N; i++) {
            arr.add(i+1);
        }

        bw.write("<");
        for(int i = 0; i < N; i++) {
            if (i == N-1) bw.write(String.valueOf(arr.get(removeIdx))+">");
            else bw.write(String.valueOf(arr.get(removeIdx))+", ");
            arr.remove(removeIdx);

            if (removeIdx == arr.size()) removeIdx = 0;
            for(int j = 0; j < K-1; j++) {
                removeIdx++;
                if (removeIdx == arr.size()) removeIdx = 0;
            }
        }
        bw.flush();
        bw.close();


    }
}