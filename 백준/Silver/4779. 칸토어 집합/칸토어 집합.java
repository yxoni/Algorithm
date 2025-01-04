import java.io.*;
import java.util.*;

public class Main {
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            int N = Integer.parseInt(str);
            if (N == 0) {
                sb.append("-");
            } else {
                dq((int) Math.pow(3, N));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void dq(int n) {
        int num = n / 3;

        String[] str = new String[num];
        Arrays.fill(str, " ");

        if (num == 1) {
            String[] str1 = new String[num];
            String[] str2 = new String[num];
            Arrays.fill(str1, "-");
            Arrays.fill(str2, "-");

            sb.append(String.join("", str1));
            sb.append(String.join("", str));
            sb.append(String.join("", str2));
            return;
        }

        dq(num);
        sb.append(String.join("", str));
        dq(num);
    }
}