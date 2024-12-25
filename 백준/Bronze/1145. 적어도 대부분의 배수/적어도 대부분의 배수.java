import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int num = arr[2];
        boolean flag = false;
        while (!flag) {
            int cnt = 0;
            for (int i : arr) {
                if (num % i == 0) {
                    cnt++;
                }
            }

            if (cnt >=3) {
                flag = true;
            } else {
                num++;
            }
        }
        sb.append(num);
        System.out.println(sb);

    }

}