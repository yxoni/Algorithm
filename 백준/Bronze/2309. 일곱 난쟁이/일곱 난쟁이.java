import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        boolean flag = false;
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    arr[i] = arr[j] = 0;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        Arrays.sort(arr);

        for (int i = 2; i < 9; i++) {
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}