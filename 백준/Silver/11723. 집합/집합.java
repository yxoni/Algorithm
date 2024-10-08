import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        Boolean[] arr = new Boolean[21];
        Arrays.fill(arr, false);
        int n;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "add":
                    arr[Integer.parseInt(st.nextToken())] = true;
                    break;
                case "remove":
                    arr[Integer.parseInt(st.nextToken())] = false;
                    break;
                case "check":
                    bw.write(arr[Integer.parseInt(st.nextToken())] ? "1" : "0");
                    bw.newLine();
                    break;
                case "toggle":
                    n = Integer.parseInt(st.nextToken());
                    arr[n] = !arr[n];
                    break;
                case "all":
                    Arrays.fill(arr, true);
                    break;
                case "empty":
                    Arrays.fill(arr, false);
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}