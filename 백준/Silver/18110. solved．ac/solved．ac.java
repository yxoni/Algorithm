import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int exception = (int)Math.round(n * 0.15);
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int i = exception; i < n-exception; i++) {
            sum += arr[i];
        }

        bw.write(String.valueOf(Math.round((double)sum/(n-exception*2))));
        bw.flush();
        bw.close();
    }
}