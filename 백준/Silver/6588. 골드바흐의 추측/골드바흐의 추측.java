import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] arr = new boolean[1000001];
        arr[0] = arr[1] = true;
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (!arr[i]) {
                for (int j = i*i; j < 1000000; j+=i) {
                    arr[j] = true;
                }
            }
        }

        int n;
        boolean flag;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            flag = true;
            for (int i = 3; i < n; i+=2) {
                if (arr[i]) continue;
                if (!arr[n-i]) {
                    bw.write(String.valueOf(n) + " = " + String.valueOf(i) + " + " + String.valueOf(n-i) + "\n");
                    flag = false;
                    break;
                }
            }
            if(flag) bw.write("GoldBach's conjecture is wrong.");
        }
        
        bw.flush();
        bw.close();
    }
}